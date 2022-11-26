package com.example.firstspringbootproject.DAO.Repositories;

import com.example.firstspringbootproject.DAO.Entities.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, Long> {
}
