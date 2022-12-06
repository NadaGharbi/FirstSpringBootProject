package com.example.firstspringbootproject.RestControllers;

import com.example.firstspringbootproject.DAO.Entities.Contrat;
import com.example.firstspringbootproject.DAO.Entities.Etudiant;
import com.example.firstspringbootproject.Services.IContratService;
import com.example.firstspringbootproject.Services.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("etudiants")
public class EtudiantRestController {

    @Autowired
    private IEtudiantService ies;

    @PostMapping("ajouterE") //exposer en tant que WS
    Etudiant ajouterEtudiant(@RequestBody Etudiant e){ //obj json de type Contrat
        return ies.addEtudiant(e); //on appelle l'implementation du service
    }

    @PutMapping("modifierE")
    Etudiant modifierEtudiant(@RequestBody Etudiant e){
        return ies.addEtudiant(e); //on appelle l'implementation du ContratService
    }

    @DeleteMapping("supprimerObjE")
    void supprimerEtudiant(@RequestBody Etudiant e){
        ies.deleteEtudiant(e);
    }

    @DeleteMapping("supprimerIdC/{id}") //doit etre le meme nom de la var
    void supprimerEtudiantById(@PathVariable Long id){
        ies.deleteEtudiantById(id);
    }

    @GetMapping("afficherListC")
    List<Etudiant> trouverAllEtudiants(){
        return ies.findAllEtudiants();
    }

    @GetMapping("afficherObjC") //@avec RequestParam ne rien ajouter dans l'uri
    Etudiant trouverById(@RequestParam Long id){
        return ies.findById(id);
    }

}
