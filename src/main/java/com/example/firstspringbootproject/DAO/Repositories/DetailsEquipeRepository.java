package com.example.firstspringbootproject.DAO.Repositories;

import com.example.firstspringbootproject.DAO.Entities.DetailsEquipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsEquipeRepository extends CrudRepository<DetailsEquipe, Long> {
}
