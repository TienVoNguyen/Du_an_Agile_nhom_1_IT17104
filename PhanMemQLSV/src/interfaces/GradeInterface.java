
package interfaces;

import java.util.ArrayList;

public interface GradeInterface<T> {
    public void add(T t) throws Exception;
    
    public void update(T t) throws Exception;
    
    public void delete(String maSV) throws Exception;
    
    public ArrayList<T> getList() throws Exception;
    
    public void setList(ArrayList<T> lst) throws Exception;
    
    public void findByID(String maSV) throws Exception;
    
    public T getGrade() throws Exception;
    
    public T next();
    
    public T pre();
    
    public T last();
    
    public T first();
}
