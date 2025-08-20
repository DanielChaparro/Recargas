package com.gelsa.recargas.service.impl;

import com.gelsa.recargas.dto.RecargaDTO;
import com.gelsa.recargas.service.RecargaService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecargaServiceImpl implements RecargaService {
    @Override
    public String recargar(String numeroCliente, String codigoOperador, String codigoVendedor) {
        return null;
    }

    @Override
    public Optional<RecargaDTO> findByAll() {
        return Optional.empty();
    }

    @Override
    public String findByCliente(String numero) {
        return null;
    }

    @Override
    public String findByOperador(String codigo) {
        return null;
    }

    @Override
    public String findByVendedor(String codigo) {
        return null;
    }
}
