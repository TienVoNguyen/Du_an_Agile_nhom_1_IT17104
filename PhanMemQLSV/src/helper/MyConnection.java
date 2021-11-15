/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;

/**
 *
 * @author NTV
 */
public class MyConnection {

    public static Connection ConnectionSQL() {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("123");
        ds.setPortNumber(1433);
        ds.setServerName("localhost");
        ds.setDatabaseName("FPL_DT");
        try {
            Connection con = ds.getConnection();

            return con;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
