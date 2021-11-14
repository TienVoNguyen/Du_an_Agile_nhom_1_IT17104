/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author NTV
 */
public class MyConnection {
        public void ConnectionSQL(String SeverName_SQL) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("123");
        ds.setPortNumber(1433);
        ds.setServerName(SeverName_SQL);
        ds.setDatabaseName("FPT_APP");
        try {
            Connection con = ds.getConnection();
            con.close();
        } catch (SQLServerException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    
    
}
