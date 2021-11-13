/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author NTV
 */
public interface UserInterface<T> {    
    public ArrayList<T> getList() throws Exception;
    
    public boolean checkLogin(String username, String pass);
    
}
