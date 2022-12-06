package com.example.firstspringbootproject.RestControllers;

import com.example.firstspringbootproject.DAO.Entities.Equipe;
import com.example.firstspringbootproject.Services.IEquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("equipes")
public class EquipeRestController {

    @Autowired
    private IEquipeService ies;

    @PostMapping("ajouterE") //exposer en tant que WS
    Equipe ajouterEquipe(@RequestBody Equipe e){ //obj json de type Contrat
        return ies.addEquipe(e); //on appelle l'implementation du service
    }

    @PutMapping("modifierE")
    Equipe modifierEquipe(@RequestBody Equipe e){
        return ies.addEquipe(e); //on appelle l'implementation du ContratService
    }

    @DeleteMapping("supprimerObjE")
    void supprimerEquipe(@RequestBody Equipe e){
        ies.deleteEquipe(e);
    }

    @DeleteMapping("supprimerIdE/{id}") //doit etre le meme nom de la var
    void supprimerEquipeById(@PathVariable Long id){ies.deleteEquipeById(id);
    }

    @GetMapping("afficherListE")
    List<Equipe> trouverAllEquipes(){
        return ies.findAllEquipes();
    }

    @GetMapping("afficherObjE") //@avec RequestParam ne rien ajouter dans l'uri
    Equipe trouverById(@RequestParam Long id){
        return ies.findById(id);
    }

}
