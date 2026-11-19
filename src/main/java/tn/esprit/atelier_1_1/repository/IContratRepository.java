package tn.esprit.atelier_1_1.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.atelier_1_1.domain.Contrat;

public interface IContratRepository extends CrudRepository<Contrat, Long> {

}