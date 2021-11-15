/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;
<<<<<<< HEAD

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.SQLException;

=======
>>>>>>> 892d423e10bceeab4bd803aac6df9de3889843ba
/**
 *
 * @author NTV
 */
public class MyConnection {
<<<<<<< HEAD
           public Connection ConnectionSQL(String SeverName_SQL) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("123");
        ds.setPortNumber(1433);
        ds.setServerName(SeverName_SQL);
        ds.setDatabaseName("FPT_APP");
        try {
            Connection con = ds.getConnection();           
            return con;
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
               return null;

    }
=======
  
    
>>>>>>> 892d423e10bceeab4bd803aac6df9de3889843ba
}
