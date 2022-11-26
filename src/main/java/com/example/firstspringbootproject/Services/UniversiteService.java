package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Repositories.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UniversiteService implements IUniversiteService{

    @Autowired
    private UniversiteRepository UR;
}
