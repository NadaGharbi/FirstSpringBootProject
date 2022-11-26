package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Repositories.DetailsEquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DetailsEquipeService implements IDetailsEquipeService{

    @Autowired
    private DetailsEquipeRepository DER;
}
