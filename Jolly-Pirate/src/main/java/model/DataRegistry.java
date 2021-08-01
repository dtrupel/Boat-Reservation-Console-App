package model;

import java.util.List;

public interface DataRegistry<T> {

    void add(T data);
    void delete(T data);

    T retrieve(String id);
    List<T> getAll();

    boolean isEmpty();
}
