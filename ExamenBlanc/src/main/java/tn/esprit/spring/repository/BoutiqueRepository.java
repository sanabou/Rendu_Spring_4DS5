package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Boutique;

import java.util.List;

@Repository
public interface BoutiqueRepository extends JpaRepository<Boutique,Long> {
    @Query("select b from Boutique b where b.centre.id =?1")
    List<Boutique> listeBoutiques(Long idCentre);
}
