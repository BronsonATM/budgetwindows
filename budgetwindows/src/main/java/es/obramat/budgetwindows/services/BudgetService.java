package es.obramat.budgetwindows.services;

import org.springframework.stereotype.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import es.obramat.budgetwindows.models.BudgetModel;
import es.obramat.budgetwindows.repositories.BudgetDAO;

@Service
public class BudgetService {
    
    @Autowired
    private BudgetDAO budgetDAO;

    public BudgetModel inserBudgetModel(BudgetModel budget){
        return budgetDAO.save(budget);
    }

    public BudgetModel updaBudgetModel(Long id, BudgetModel budget){
        Optional<BudgetModel> budgetFind = budgetDAO.findById(id);
        if(budgetFind.isPresent()){
            BudgetModel budgetUpdated = budgetFind.get();
            budgetUpdated.setEstado(budget.getEstado());
            budgetUpdated.setFecha_creacion(budget.getFecha_creacion());
            budgetUpdated.setImpuestos(budget.getImpuestos());
            budgetUpdated.setSub_precio(budget.getSub_precio());
            budgetUpdated.setTotal_precio(budget.getTotal_precio());
            return budgetDAO.save(budgetUpdated);
        }
        return null;
    }

    public void deleteBudget(Long id){
        budgetDAO.deleteById(id);
    }

}
