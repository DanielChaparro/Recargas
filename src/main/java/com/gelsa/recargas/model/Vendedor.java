package com.gelsa.recargas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vendedores")
public class Vendedor {

    @Id
    private Long id;
    private String nombre;
    private String codigo;
}
