package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Repositories.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DepartementService implements  IDepartementService{

    @Autowired
    private DepartementRepository DR;
}
