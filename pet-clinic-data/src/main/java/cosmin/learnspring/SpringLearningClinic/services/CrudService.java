package cosmin.learnspring.SpringLearningClinic.services;

import java.util.Set;

public interface CrudService<T, ID> {

    T findByID (ID id);

    Set<T> findAll ();

    T save (T entity);

    void delete (T entity);

    void deleteByID (ID id);

}
