package cosmin.learnspring.SpringLearningClinic.services;

import cosmin.learnspring.SpringLearningClinic.model.Pet;
import org.springframework.stereotype.Service;


@Service
public interface PetService extends CrudService<Pet, Long> {

}
