package model;

import java.util.List;

public interface IdGenerator<T> {

    boolean idExists(List<T> list, String id);
    String generateId(List<T> list);
}
