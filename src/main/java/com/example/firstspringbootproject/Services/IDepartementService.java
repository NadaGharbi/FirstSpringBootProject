package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Entities.Contrat;
import com.example.firstspringbootproject.DAO.Entities.Departement;

import java.util.List;

public interface IDepartementService {

    Departement addDepartement(Departement d);
    Departement updateDepartement(Departement d);
    void deleteDepartement(Departement d);
    void deleteDepartementById(Long id);
    List<Departement> findAllDepartements();
    Departement findById(Long id);

}
