package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Entities.Contrat;
import com.example.firstspringbootproject.DAO.Entities.Departement;
import com.example.firstspringbootproject.DAO.Repositories.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartementService implements  IDepartementService{

    @Autowired
    private DepartementRepository DR;

    @Override
    public Departement addDepartement(Departement d) {
        return DR.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return DR.save(d);
    }

    @Override
    public void deleteDepartement(Departement d) {
        DR.delete(d);
    }

    @Override
    public void deleteDepartementById(Long id) {
        DR.deleteById(id);
    }

    @Override
    public List<Departement> findAllDepartements() {
        return (List<Departement>) DR.findAll();
    }

    @Override
    public Departement findById(Long id) {
        return DR.findById(id).get();
    }
}
