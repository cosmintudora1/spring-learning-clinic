package cosmin.learnspring.SpringLearningClinic.services;

import cosmin.learnspring.SpringLearningClinic.model.Owner;
import org.springframework.stereotype.Service;


@Service
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName (String lastName);
}
