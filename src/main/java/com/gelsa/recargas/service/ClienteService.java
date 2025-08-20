package com.gelsa.recargas.service;

import com.gelsa.recargas.dto.ClienteDTO;

import java.util.Optional;

public interface ClienteService {
    String createCliente(String name, String numero, String codigoOperador);
    Optional<ClienteDTO> findAll();
    String findByNumero(String numero);
}
