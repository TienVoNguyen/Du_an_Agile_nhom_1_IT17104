/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import helper.MyConnection;
import interfaces.GradeInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.Grade;
import models.Student;

/**
 *
 * @author NTV
 */
public class GradeDAO implements GradeInterface<Grade> {

    @Override
    public boolean add(Grade t) throws Exception {
        String sql = "INSERT INTO [dbo].[Grade]([maSV],[tiengAnh],[tinHoc],[GDTC]) VALUES( ?, ?, ?, ?)";
        Connection con = MyConnection.ConnectionSQL();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, t.getMaSV());
        pstmt.setFloat(2, t.getTiengAnh());
        pstmt.setFloat(3, t.getTinHoc());
        pstmt.setFloat(4, t.getgDTC());
        return pstmt.executeUpdate() > 0;
        
    }

    @Override
    public boolean update(Grade st) throws Exception {
        String sql = "UPDATE GRADE SET tiengAnh = ?, tinHoc = ?, GDTC = ? WHERE maSV = ?";
        Connection con = MyConnection.ConnectionSQL();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(4, st.getMaSV());
        pstmt.setFloat(1, st.getTiengAnh());
        pstmt.setFloat(2, st.getTinHoc());
        pstmt.setFloat(3, st.getgDTC());
        return pstmt.executeUpdate() > 0;
    }

    @Override
    public boolean delete(String maSV) throws Exception {
        String sql = "DELETE FROM [dbo].[Grade] WHERE [maSV] = ?";
        try (
                Connection con = MyConnection.ConnectionSQL();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, maSV);
            return pstmt.executeUpdate() > 0;
        }
    }

    @Override
    public ArrayList<Grade> getList() throws Exception {
        String sql = "SELECT * FROM [Grade]";
         try (
                Connection con = MyConnection.ConnectionSQL();
                PreparedStatement pstm = con.prepareStatement(sql);) {

            
            try (ResultSet rs = pstm.executeQuery()) {
                ArrayList<Grade> list = new ArrayList<>();
                while (rs.next()) {
                    Grade st = new Grade();
                    st.setMaSV(rs.getString("maSV"));
                    st.setId(rs.getInt("id"));
                    st.setTiengAnh(rs.getFloat("tiengAnh"));
                    st.setTinHoc(rs.getFloat("tinHoc"));
                    st.setgDTC(rs.getFloat("GDTC"));
                    
                    list.add(st);
                    
                }
                return list;
            }
            
        }
        
    }

    @Override
    public void setList(ArrayList<Grade> lst) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Grade findByID(String maSV) throws Exception {
        String sql = "SELECT * FROM [Grade] WHERE [maSV] = ?";
        try(
                Connection con = MyConnection.ConnectionSQL();
                PreparedStatement pstm = con.prepareStatement(sql);
                ){
            pstm.setString(1, maSV);
            try(ResultSet rs = pstm.executeQuery()){
                if (rs.next()){
                    Grade st = new Grade();
                    st.setMaSV(rs.getString("maSV"));
                    st.setId(rs.getInt("id"));
                    st.setTiengAnh(rs.getFloat("tiengAnh"));
                    st.setTinHoc(rs.getFloat("tinHoc"));
                    st.setgDTC(rs.getFloat("GDTC"));
                    return st;
                }
                
            }
            return null;
        }
    }

    @Override
    public Grade getGrade() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Grade next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Grade pre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Grade last() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Grade first() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
