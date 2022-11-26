package com.example.firstspringbootproject.DAO.Repositories;

import com.example.firstspringbootproject.DAO.Entities.Universite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UniversiteRepository extends CrudRepository<Universite, Long> {
}
