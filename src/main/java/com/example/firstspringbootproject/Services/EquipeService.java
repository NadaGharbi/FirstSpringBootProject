package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Repositories.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EquipeService implements IEquipeService{
    @Autowired
    private EquipeRepository EqR;
}
