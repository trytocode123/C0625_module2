package furama.service;
import furama.util.UserException;


import java.util.List;

public interface IService<T> {
    List<T> findAll();

    boolean add(T customer);

    boolean update(int i, T customer);
}
