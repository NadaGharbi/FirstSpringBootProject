package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Entities.DetailsEquipe;
import com.example.firstspringbootproject.DAO.Repositories.DetailsEquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DetailsEquipeService implements IDetailsEquipeService{

    @Autowired
    private DetailsEquipeRepository DER;

    @Override
    public DetailsEquipe addDetailsEquipe(DetailsEquipe DE) {
        return DER.save(DE);
    }

    @Override
    public DetailsEquipe updateDetailsEquipe(DetailsEquipe DE) {
        return DER.save(DE);
    }

    @Override
    public void deleteDetailsEquipe(DetailsEquipe DE) {
        DER.delete(DE);
    }

    @Override
    public void deleteDetailsEquipeById(Long id) {
        DER.deleteById(id);
    }

    @Override
    public List<DetailsEquipe> findAllDetailsEquipe() {
        return (List<DetailsEquipe>) DER.findAll();
    }

    @Override
    public DetailsEquipe findById(Long id) {
        return DER.findById(id).get();
    }
}
