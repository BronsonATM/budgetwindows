package es.obramat.budgetwindows.repositories;

import org.springframework.data.repository.CrudRepository;

import es.obramat.budgetwindows.models.BudgetModel;

public interface BudgetDAO extends CrudRepository<BudgetModel, Long> {

    
}