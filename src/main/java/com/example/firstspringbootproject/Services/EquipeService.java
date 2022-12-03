package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Entities.Equipe;
import com.example.firstspringbootproject.DAO.Repositories.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EquipeService implements IEquipeService{
    @Autowired
    private EquipeRepository EQR;

    @Override
    public Equipe addEquipe(Equipe e) {
        return EQR.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return EQR.save(e);
    }

    @Override
    public void deleteEquipe(Equipe e) {
        EQR.delete(e);
    }

    @Override
    public void deleteEquipeById(Long id) {
        EQR.deleteById(id);
    }

    @Override
    public List<Equipe> findAllEquipes() {
        return (List<Equipe>) EQR.findAll();
    }

    @Override
    public Equipe findById(Long id) {
        return EQR.findById(id).get();
    }
}
