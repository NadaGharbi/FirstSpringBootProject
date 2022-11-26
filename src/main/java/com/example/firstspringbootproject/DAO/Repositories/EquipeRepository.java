package com.example.firstspringbootproject.DAO.Repositories;

import com.example.firstspringbootproject.DAO.Entities.Equipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends CrudRepository<Equipe, Long> {
}
