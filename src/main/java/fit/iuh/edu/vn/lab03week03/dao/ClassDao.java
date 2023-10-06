package fit.iuh.edu.vn.lab03week03.dao;



import java.util.List;


public interface ClassDao<T,ID> {
   public boolean update(T entity,ID id);

    public boolean delete(ID id);

    public boolean insert(T entity);

    public List<T> findAll();

    public T findById(ID id);

}
