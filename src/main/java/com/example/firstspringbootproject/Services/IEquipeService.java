package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Entities.Contrat;
import com.example.firstspringbootproject.DAO.Entities.Equipe;

import java.util.List;

public interface IEquipeService {

    Equipe addEquipe(Equipe e);
    Equipe updateEquipe(Equipe e);
    void deleteEquipe(Equipe e);
    void deleteEquipeById(Long id);
    List<Equipe> findAllEquipes();
    Equipe findById(Long id);
}
