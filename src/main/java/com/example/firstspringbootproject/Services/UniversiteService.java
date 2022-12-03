package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Entities.Universite;
import com.example.firstspringbootproject.DAO.Repositories.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UniversiteService implements IUniversiteService{

    @Autowired
    private UniversiteRepository UR;

    @Override
    public Universite addUniversite(Universite u) {
        return UR.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return UR.save(u);
    }

    @Override
    public void deleteUniversite(Universite u) {
        UR.delete(u);
    }

    @Override
    public void deleteUniversiteById(Long id) {
        UR.deleteById(id);
    }

    @Override
    public List<Universite> findAllUniversites() {
        return (List<Universite>) UR.findAll();
    }

    @Override
    public Universite findById(Long id) {
        return UR.findById(id).get();
    }
}
