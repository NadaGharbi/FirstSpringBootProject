package com.example.firstspringbootproject.DAO.Repositories;

import com.example.firstspringbootproject.DAO.Entities.Contrat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ContratRepository extends CrudRepository <Contrat,Long> /* nom de l'entité, le type primitif de l'id avc premiere lettre majus*/ {
  //=select * from Contrat where archive=(valeur qui va etre passée en parametre)
    List<Contrat> getByArchive(boolean archive);//doit commencer par get ou find

    //=select * from Contrat where archive=(valeur qui va etre passée en parametere) AND dateDebutC=(valeur)
    List<Contrat> getByArchiveAndAndDateDebutC(boolean archive, Date date);

    //select * from Contrat where dateDebutC>(param) AND dateDebutC<(param)
    List<Contrat> getByDateDebutCBetween(Date dateinf, Date datesup);

}
