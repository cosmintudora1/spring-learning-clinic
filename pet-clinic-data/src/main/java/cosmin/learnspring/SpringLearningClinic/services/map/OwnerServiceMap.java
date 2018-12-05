package cosmin.learnspring.SpringLearningClinic.services.map;

import cosmin.learnspring.SpringLearningClinic.model.Owner;
import cosmin.learnspring.SpringLearningClinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Owner findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner entity) {
        return super.save(entity.getId(), entity);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}
