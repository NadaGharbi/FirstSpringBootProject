package com.example.firstspringbootproject.RestControllers;

import com.example.firstspringbootproject.DAO.Entities.Contrat;
import com.example.firstspringbootproject.Services.IContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contrats") //pr personnaliser l'acces au WS
public class ContratRestController {
    //on va exposer les methodes du service contratService
    @Autowired
    private IContratService ics;

    @PostMapping("ajouterC") //exposer en tant que WS
    Contrat ajouterContract(@RequestBody Contrat c){ //obj json de type Contrat
        return ics.addContract(c); //on appelle l'implementation du service
    }

    @PutMapping("modifierC")
    Contrat modifierContract(@RequestBody Contrat c){
        return ics.addContract(c); //on appelle l'implementation du ContratService
    }

    @DeleteMapping("supprimerObjC")
    void supprimerContract(@RequestBody Contrat c){
        ics.deleteContract(c);
    }

    @DeleteMapping("supprimerIdC/{id}") //doit etre le meme nom de la var
    void supprimerContractById(@PathVariable Long id){
        ics.deleteContractById(id);
    }

    @GetMapping("afficherListC")
    List<Contrat> trouverAllContracts(){
        return ics.findAllContracts();
    }

    @GetMapping("afficherObjC") //@avec RequestParam ne rien ajouter dans l'uri
    Contrat trouverById(@RequestParam Long id){
        return ics.findById(id);
    }
}
