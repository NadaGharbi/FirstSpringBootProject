package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Entities.Etudiant;
import com.example.firstspringbootproject.DAO.Repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EtudiantService implements IEtudiantService{
    @Autowired
    private EtudiantRepository ETR;

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return ETR.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return ETR.save(e);
    }

    @Override
    public void deleteEtudiant(Etudiant e) {
        ETR.delete(e);
    }

    @Override
    public void deleteEtudiantById(Long id) {
        ETR.deleteById(id);
    }

    @Override
    public List<Etudiant> findAllEtudiants() {
        return (List<Etudiant>) ETR.findAll();
    }

    @Override
    public Etudiant findById(Long id) {
        return ETR.findById(id).get();
    }
}
