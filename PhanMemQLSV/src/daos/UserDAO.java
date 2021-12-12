/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import helper.MyConnection;
import helper.ShareData;
import interfaces.UserInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.User;

/**
 *
 * @author NTV
 */
public class UserDAO implements UserInterface<User> {

    @Override
    public ArrayList<User> getList() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User checkLogin(String username, String pass) throws Exception {
        String sql = "SELECT * FROM [User] WHERE [username] = ? AND [password] = ?";
        Connection con = MyConnection.ConnectionSQL();
        try (
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, username);
            pstm.setString(2, pass);
            try (ResultSet rs = pstm.executeQuery();) {
                    if (rs.next()) {
                        ShareData.user = new User();
                        ShareData.user.setUsername(username);
                        ShareData.user.setRole(rs.getString(3));                        
                    }
            }
        }
        return ShareData.user;
    }

}
