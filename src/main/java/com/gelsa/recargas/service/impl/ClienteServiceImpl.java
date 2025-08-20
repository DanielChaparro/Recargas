package com.gelsa.recargas.service.impl;

import com.gelsa.recargas.dto.ClienteDTO;
import com.gelsa.recargas.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Override
    public String createCliente(String name, String numero, String codigoOperador) {
        return null;
    }

    @Override
    public Optional<ClienteDTO> findAll() {
        return Optional.empty();
    }

    @Override
    public String findByNumero(String numero) {
        return null;
    }
}
