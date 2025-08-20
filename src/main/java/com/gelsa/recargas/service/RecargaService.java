package com.gelsa.recargas.service;

import com.gelsa.recargas.dto.RecargaDTO;

import java.util.Optional;

public interface RecargaService {
    String recargar(String numeroCliente, String codigoOperador, String codigoVendedor);
    Optional<RecargaDTO> findByAll();
    String findByCliente(String numero);
    String findByOperador(String codigo);
    String findByVendedor(String codigo);
}
