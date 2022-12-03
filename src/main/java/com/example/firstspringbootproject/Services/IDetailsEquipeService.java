package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Entities.Contrat;
import com.example.firstspringbootproject.DAO.Entities.DetailsEquipe;

import java.util.List;

public interface IDetailsEquipeService{
    DetailsEquipe addDetailsEquipe(DetailsEquipe DE);
    DetailsEquipe updateDetailsEquipe(DetailsEquipe DE);
    void deleteDetailsEquipe(DetailsEquipe DE);
    void deleteDetailsEquipeById(Long id);
    List<DetailsEquipe> findAllDetailsEquipe();
    DetailsEquipe findById(Long id);
}
