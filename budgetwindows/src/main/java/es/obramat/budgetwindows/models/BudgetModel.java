package es.obramat.budgetwindows.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
@Table(name = "Budget")
public class BudgetModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String estado;

    private Float sub_precio;

    private Float impuestos;

    private Float total_precio;
    
    private Date fecha_creacion;
}
