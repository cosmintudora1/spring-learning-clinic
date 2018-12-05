package cosmin.learnspring.SpringLearningClinic.services.map;

import cosmin.learnspring.SpringLearningClinic.model.Pet;
import cosmin.learnspring.SpringLearningClinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Pet findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet entity) {
        super.delete(entity);
    }

    @Override
    public Pet save(Pet entity) {
        return super.save(entity.getId(), entity);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}
