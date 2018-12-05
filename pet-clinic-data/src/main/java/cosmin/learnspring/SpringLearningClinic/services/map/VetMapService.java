package cosmin.learnspring.SpringLearningClinic.services.map;

import cosmin.learnspring.SpringLearningClinic.model.Vet;
import cosmin.learnspring.SpringLearningClinic.services.CrudService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {


    @Override
    public Vet findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet entity) {
        super.delete(entity);
    }

    @Override
    public Vet save(Vet entity) {
        return super.save(entity.getId(), entity);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}
