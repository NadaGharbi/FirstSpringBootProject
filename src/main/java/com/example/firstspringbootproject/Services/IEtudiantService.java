package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Entities.Contrat;
import com.example.firstspringbootproject.DAO.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    void deleteEtudiant(Etudiant e);
    void deleteEtudiantById(Long id);
    List<Etudiant> findAllEtudiants();
    Etudiant findById(Long id);
}
