package es.obramat.budgetwindows.repositories;

import org.springframework.data.repository.CrudRepository;

import es.obramat.budgetwindows.models.SupplierModel;

public interface SupplierDAO extends CrudRepository<SupplierModel, Long> {

    
}
