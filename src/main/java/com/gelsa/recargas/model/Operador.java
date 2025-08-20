package com.gelsa.recargas.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "operadores")
public class Operador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String codigo;
}
