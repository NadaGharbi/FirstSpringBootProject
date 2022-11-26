package com.example.firstspringbootproject.Services;


import com.example.firstspringbootproject.DAO.Repositories.ContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratService implements IContratService {

    @Autowired // ou @Inject //pr que spring ioc prendre la tache de creer l'instance
    private ContratRepository CR; //instance du repo

}
