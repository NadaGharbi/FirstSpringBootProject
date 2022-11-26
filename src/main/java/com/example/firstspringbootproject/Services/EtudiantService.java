package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EtudiantService implements IEtudiantService{
    @Autowired
    private EtudiantRepository EtR;
}
