package com.example.firstspringbootproject.RestControllers;
import com.example.firstspringbootproject.DAO.Entities.Departement;
import com.example.firstspringbootproject.Services.IDepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("departements")
public class DepartementRestController {

    @Autowired
    private IDepartementService ids;

    @PostMapping("ajouterD") //exposer en tant que WS
    Departement ajouterDepartement(@RequestBody Departement d){ //obj json de type Departementt
        return ids.addDepartement(d); //on appelle l'implementation du service
    }

    @PutMapping("modifierD")
    Departement modifierDepartement(@RequestBody Departement d){
        return ids.addDepartement(d); //on appelle l'implementation du ContratService
    }

    @DeleteMapping("supprimerObjD")
    void supprimerDepartement(@RequestBody Departement d){
        ids.deleteDepartement(d);
    }

    @DeleteMapping("supprimerIdD/{id}") //doit etre le meme nom de la var
    void supprimerDepartementById(@PathVariable Long id){
        ids.deleteDepartementById(id);
    }

    @GetMapping("afficherListD")
    List<Departement> trouverAllDepartements(){
        return ids.findAllDepartements();
    }

    @GetMapping("afficherObjD") //@avec RequestParam ne rien ajouter dans l'uri
    Departement trouverById(@RequestParam Long id){
        return ids.findById(id);
    }

}
