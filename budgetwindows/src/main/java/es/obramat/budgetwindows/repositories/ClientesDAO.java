package es.obramat.budgetwindows.repositories;

import org.springframework.data.repository.CrudRepository;

import es.obramat.budgetwindows.models.ClientesModel;

public interface ClientesDAO extends CrudRepository<ClientesModel, Long> {

    
}