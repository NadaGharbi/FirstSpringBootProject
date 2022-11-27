package com.example.firstspringbootproject.Services;


import com.example.firstspringbootproject.DAO.Entities.Contrat;
import com.example.firstspringbootproject.DAO.Repositories.ContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class ContratService implements IContratService {

    @Autowired // ou @Inject //pr que spring ioc prendre la tache de creer l'instance
    private ContratRepository CR; //instance du repo

    @Override
    public Contrat addContract(Contrat c) { //save ajoute si id est null ou n'existe pas ds la BD
        return CR.save(c);
    }

    @Override
    public Contrat updateContract(Contrat c) { //save update si id de c est non null
        return CR.save(c);
    }

    @Override
    public void deleteContract(Contrat c) {
        CR.delete(c);
    }

    @Override
    public void deleteContractById(Long id) {
        CR.deleteById(id);
    }

    @Override
    public List<Contrat> findAllContracts() {
        return (List<Contrat>) CR.findAll();
    }

    @Override
    public Contrat findById(Long id) {
        return CR.findById(id).get();
    }
}
