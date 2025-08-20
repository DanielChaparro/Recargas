package com.gelsa.recargas.service;

import com.gelsa.recargas.dto.OperadorDTO;

import java.util.Optional;

public interface OperadorService {
    String createOperador(String nombre, String codigo);
    Optional<OperadorDTO> findAllOperador();
    String findById(String codigo);
}
