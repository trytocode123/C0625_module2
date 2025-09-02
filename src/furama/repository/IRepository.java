package furama.repository;


import java.util.LinkedHashMap;
import java.util.List;

public interface IRepository<T> {
    List<T> findAll();

    boolean add(T object);

    boolean update(int i, T object);
}
