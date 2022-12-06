package com.example.firstspringbootproject.RestControllers;

import com.example.firstspringbootproject.DAO.Entities.Contrat;
import com.example.firstspringbootproject.DAO.Entities.Universite;
import com.example.firstspringbootproject.Services.IContratService;
import com.example.firstspringbootproject.Services.IUniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UniversiteRestController {

    @Autowired
    private IUniversiteService ius;

    @PostMapping("ajouterU") //exposer en tant que WS
    Universite ajouterUniversite(@RequestBody Universite u){ //obj json de type Contrat
        return ius.addUniversite(u); //on appelle l'implementation du service
    }

    @PutMapping("modifierU")
    Universite modifierUniversite(@RequestBody Universite u){
        return ius.addUniversite(u); //on appelle l'implementation du ContratService
    }

    @DeleteMapping("supprimerObjU")
    void supprimerUniversite(@RequestBody Universite u){
        ius.deleteUniversite(u);
    }

    @DeleteMapping("supprimerIdU/{id}") //doit etre le meme nom de la var
    void supprimerUniversiteById(@PathVariable Long id){
        ius.deleteUniversiteById(id);
    }

    @GetMapping("afficherListU")
    List<Universite> trouverAllUniversites(){
        return ius.findAllUniversites();
    }

    @GetMapping("afficherObjU") //@avec RequestParam ne rien ajouter dans l'uri
    Universite trouverById(@RequestParam Long id){
        return ius.findById(id);
    }
}
