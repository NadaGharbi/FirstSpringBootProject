package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Entities.Contrat;
import com.example.firstspringbootproject.DAO.Entities.Universite;

import java.util.List;

public interface IUniversiteService{

    Universite addUniversite(Universite u);
    Universite updateUniversite(Universite u);
    void deleteUniversite(Universite u);
    void deleteUniversiteById(Long id);
    List<Universite> findAllUniversites();
    Universite findById(Long id);
}
