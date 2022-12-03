package com.example.firstspringbootproject.RestControllers;

import com.example.firstspringbootproject.DAO.Entities.Contrat;
import com.example.firstspringbootproject.Services.IContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContratRestController {
    //on va exposer les methodes du service contratService
    @Autowired
    private IContratService ics;

    @PostMapping
    Contrat ajouterContract(Contrat c){
        return ics.addContract(c); //on appelle l'implementation du service
    }

    @PutMapping
    Contrat modifierContract(Contrat c){
        return ics.addContract(c); //on appelle l'implementation du ContratService
    }

    @DeleteMapping
    void supprimerContract(Contrat c){
        ics.deleteContract(c);
    }

    @DeleteMapping
    void supprimerContractById(Long id){
        ics.deleteContractById(id);
    }

    @GetMapping
    List<Contrat> trouverAllContracts(){
        return ics.findAllContracts();
    }

    @GetMapping
    Contrat trouverById(Long id){
        return ics.findById(id);
    }
}
