package com.gelsa.recargas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "recargas")
public class Recarga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private Operador operador;
    @OneToMany
    private Vendedor vendedor;
    @OneToMany
    private Cliente cliente;
}
