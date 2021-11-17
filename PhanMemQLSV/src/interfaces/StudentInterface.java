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
public interface StudentInterface<T> {
    public boolean add(T t) throws Exception;
    
    public boolean update(T t) throws Exception;
    
    public boolean delete(String maSV) throws Exception;
    
    public void setList(ArrayList<T> lst) throws Exception;
    
    public T findByID(String maSV) throws Exception;
    
    public ArrayList<T> getDanhSachSV()throws Exception;
    
}
