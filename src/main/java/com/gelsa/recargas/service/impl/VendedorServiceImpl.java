package com.gelsa.recargas.service.impl;

import com.gelsa.recargas.dto.VendedorDTO;
import com.gelsa.recargas.service.VendedorService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VendedorServiceImpl implements VendedorService {
    @Override
    public String createVendedor(String name, String codigo) {
        return null;
    }

    @Override
    public Optional<VendedorDTO> listAllVendedores() {
        return Optional.empty();
    }

    @Override
    public String getByCodigo(String codigo) {
        return null;
    }
}
