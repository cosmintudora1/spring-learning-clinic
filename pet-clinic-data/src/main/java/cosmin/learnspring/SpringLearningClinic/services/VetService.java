package cosmin.learnspring.SpringLearningClinic.services;

import cosmin.learnspring.SpringLearningClinic.model.Vet;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

    Vet findByLastName (String lastName);
}
