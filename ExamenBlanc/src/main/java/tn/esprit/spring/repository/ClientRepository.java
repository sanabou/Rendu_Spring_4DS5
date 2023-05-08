package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Categorie;
import tn.esprit.spring.entities.Client;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    @Query("select c from Client c join c.boutiques b where b.id=:idB")
    List<Client> listeClients(@Param("idB") Long idBoutique);

    @Query("select c from Client c join c.boutiques b where b.categorie=:categ")
    List<Client> clientParCategorie(@Param("categ")Categorie categorie);

    @Query("select count(DISTINCT c) from Client c where c.genre='Feminin'")
    int nbrClientFemme();

    @Query("select count(DISTINCT c) from Client c where c.genre='Masculin'")
    int nbrClientHomme();
}
