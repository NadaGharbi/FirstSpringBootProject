package com.example.firstspringbootproject.DAO.Repositories;

import com.example.firstspringbootproject.DAO.Entities.Etudiant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, Long> {
//dans classe Etudiant on a List<Equipe> equipes; ET dans classe Equipe l'id c IdEquipe
    //premiere partie affiche la liste des étudiants de l'équipe dont son id est passé en paramétres
    //dans la 2eme partie: DetailsEquipe est dans la classe Equipe
    //List<Etudiant> findByEquipesIdEquipeANDEquipesDetailsEquipeSalle(Long id,int salle);

    //methode en JPQL
    @Query("SELECT E from Etudiant E WHERE E.nomE= : nom AND E.prenomE= : prenom")
            //get etudiant by nom et renom
    Etudiant getEtudiantByNomEtPrenomJPQL(@Param(value = "nom" ) String nom, @Param(value = "prenom" ) String prenom); //l'ordre n'est pas important

    //methode en SQL
    @Query(value= "SELECT * from Etudiant WHERE nome=?1 AND prenome=?2 ", nativeQuery = true) //l'ordre est tres important
    Etudiant getEtudiantByNomEtPrenomSQL(String name, String surname);

}
