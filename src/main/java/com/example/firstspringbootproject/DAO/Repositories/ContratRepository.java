package com.example.firstspringbootproject.DAO.Repositories;

import com.example.firstspringbootproject.DAO.Entities.Contrat;
import org.springframework.data.repository.CrudRepository;

public interface ContratRepository extends CrudRepository <Contrat,Long> /* nom de l'entité, le type primitif de l'id avc premiere lettre majus*/ {
}
