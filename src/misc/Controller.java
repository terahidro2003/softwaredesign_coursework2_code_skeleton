package misc;

import events.EventInterface;

import java.util.List;
import java.util.UUID;

public interface Controller<T> {
    void route(EventInterface event);
    void create(T creatable);
    void remove(T deletable);
    List<?> get(String filters);
    T find(UUID id);
}
