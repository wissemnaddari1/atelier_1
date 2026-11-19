package tn.esprit.atelier_1_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.atelier_1_1.domain.Paiement;

public interface IPaiementRepository extends JpaRepository<Paiement, Long> {

}