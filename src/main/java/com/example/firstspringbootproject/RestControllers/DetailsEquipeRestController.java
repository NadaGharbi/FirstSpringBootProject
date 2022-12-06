package com.example.firstspringbootproject.RestControllers;

import com.example.firstspringbootproject.DAO.Entities.Contrat;
import com.example.firstspringbootproject.DAO.Entities.DetailsEquipe;
import com.example.firstspringbootproject.Services.IContratService;
import com.example.firstspringbootproject.Services.IDetailsEquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("detailsEquipe") //pr personnaliser l'acces au WS
public class DetailsEquipeRestController {

    @Autowired
    private IDetailsEquipeService ides;

    @PostMapping("ajouterDE") //exposer en tant que WS
    DetailsEquipe ajouterDetailsEquipe(@RequestBody DetailsEquipe de){ //obj json de type Contrat
        return ides.addDetailsEquipe(de); //on appelle l'implementation du service
    }

    @PutMapping("modifierDE")
    DetailsEquipe modifierDetailsEquipe(@RequestBody DetailsEquipe de){
        return ides.addDetailsEquipe(de); //on appelle l'implementation du ContratService
    }

    @DeleteMapping("supprimerObjDE")
    void supprimerDetailsEquipe(@RequestBody DetailsEquipe de){
        ides.deleteDetailsEquipe(de);
    }

    @DeleteMapping("supprimerIdDE/{id}") //doit etre le meme nom de la var
    void supprimerDetailsEquipeById(@PathVariable Long id){
        ides.deleteDetailsEquipeById(id);
    }

    @GetMapping("afficherListDE")
    List<DetailsEquipe> trouverAllContracts(){ return ides.findAllDetailsEquipe();
    }

    @GetMapping("afficherObjDE") //@avec RequestParam ne rien ajouter dans l'uri
    DetailsEquipe trouverById(@RequestParam Long id){
        return ides.findById(id);
    }
}
