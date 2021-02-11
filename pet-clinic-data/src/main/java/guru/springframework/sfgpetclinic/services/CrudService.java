package guru.springframework.sfgpetclinic.services;

import java.util.Set;

// The use of generics is used to make the service as flexible as possible
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
