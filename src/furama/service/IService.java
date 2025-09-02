package furama.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();

    boolean add(T customer);

    boolean update(int i, T customer);
}
