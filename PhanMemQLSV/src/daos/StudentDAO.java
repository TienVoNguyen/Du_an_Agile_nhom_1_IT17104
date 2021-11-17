/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import helper.MyConnection;
import interfaces.StudentInterface;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.rowset.serial.SerialBlob;
import models.Student;

/**
 *
 * @author NTV
 */
public class StudentDAO implements StudentInterface<Student>{

    @Override
    public boolean add(Student student) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Student student) throws Exception {
        String sql = "UPDATE [dbo].[Student] SET [hoTen] = ?,[email] = ?,[sdt] = ?,[diaChi] = ?,[gioiTinh] = ?,[hinh] = ? WHERE [maSV] = ?";
        Connection con = MyConnection.ConnectionSQL();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(7, student.getMaSV());
        pstmt.setString(1, student.getHoTen());
        pstmt.setString(2, student.getEmail());
        pstmt.setString(3, student.getSdt());
        pstmt.setString(4, student.getDiaChi());
        pstmt.setBoolean(5, student.isGt());
        Blob hinh = null;
        if (student.getHinh() != null){
            hinh = new SerialBlob(student.getHinh());
        }
        pstmt.setBlob(6, hinh);
        
        return pstmt.executeUpdate() > 0;
    }

    @Override
    public boolean delete(String maSV) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> getList() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setList(ArrayList<Student> lst) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student findByID(String maSV) throws Exception {
        String sql = "SELECT * FROM [Student] WHERE [maSV] = ?";
        try (
                Connection con = MyConnection.ConnectionSQL();
                PreparedStatement pstm = con.prepareStatement(sql);) {

            pstm.setString(1, maSV);
            try (ResultSet rs = pstm.executeQuery()) {
                if (rs.next()) {
                    Student sv = createNewSinhVien(rs);
                    

                    return sv;
                }
            }
            return null;
        }
    }
    
    public Student createNewSinhVien(final ResultSet rs) throws SQLException {
        Student sv = new Student();
        sv.setMaSV(rs.getString("maSV"));
        sv.setHoTen(rs.getString("hoTen"));
        sv.setEmail(rs.getString("email"));
        sv.setSdt(rs.getString("sdt"));
        sv.setGt(rs.getBoolean("gioiTinh"));
        sv.setDiaChi(rs.getString("diaChi"));
        Blob blod = rs.getBlob("hinh");
        if (blod != null){
            sv.setHinh(blod.getBytes(1, (int) blod.length()));
        }
        return sv;
    }

    @Override
    public ArrayList<Student> getDanhSachSV() throws Exception {
         String sql = "SELECT * FROM [Student]";
        try (
                Connection con = MyConnection.ConnectionSQL();
                PreparedStatement pstm = con.prepareStatement(sql);) {

            
            try (ResultSet rs = pstm.executeQuery()) {
                ArrayList<Student> list = new ArrayList<>();
                while (rs.next()) {
                    Student sv = createNewSinhVien(rs);
                    
                    list.add(sv);
                    
                }
                return list;
            }
            
        }
    }
}
