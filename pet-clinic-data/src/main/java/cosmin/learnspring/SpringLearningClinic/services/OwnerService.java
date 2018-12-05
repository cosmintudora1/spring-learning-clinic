package cosmin.learnspring.SpringLearningClinic.services;

import cosmin.learnspring.SpringLearningClinic.model.Owner;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface OwnerService {

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

    Owner findByLastName (String lastName);
}
