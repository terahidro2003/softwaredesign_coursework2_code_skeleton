package database;

import java.util.List;

public interface DatabaseDAOInterface<T> {
    void connect();

    void save(T toCreate);

    void delete(T toDelete);

    void update(T toUpdate);

    List<T> get(String filter);

    T find(String filter);

    List<T> customSelect(String filter);

    void customOperation(String query);
}
