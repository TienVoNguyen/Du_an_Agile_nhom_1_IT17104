
package interfaces;

import java.util.ArrayList;

public interface GradeInterface<T> {
    public boolean add(T t) throws Exception;
    
    public boolean update(T t) throws Exception;
    
    public boolean delete(String maSV) throws Exception;
    
    public ArrayList<T> getList() throws Exception;
    
    public void setList(ArrayList<T> lst) throws Exception;
    
    public T findByID(String maSV) throws Exception;
    
    public T getGrade() throws Exception;
    
    public T next();
    
    public T pre();
    
    public T last();
    
    public T first();
}
