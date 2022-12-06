package com.example.firstspringbootproject.Services;

import com.example.firstspringbootproject.DAO.Entities.Contrat;

import java.util.List;

public interface IContratService {

    Contrat addContract(Contrat c);
    Contrat updateContract(Contrat c);
    void deleteContract(Contrat c);
    void deleteContractById(Long id);
    List<Contrat> findAllContracts();
    Contrat findById(Long id);
    List<Contrat> searchContratByArchive(boolean arch);





}
