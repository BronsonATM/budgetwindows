package es.obramat.budgetwindows.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import es.obramat.budgetwindows.repositories.BudgetDAO;

@Service
public class BudgetService {
    
    @Autowired
    private BudgetDAO budgetDAO;

}
