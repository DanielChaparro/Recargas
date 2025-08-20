package com.gelsa.recargas.service.impl;

import com.gelsa.recargas.dto.OperadorDTO;
import com.gelsa.recargas.service.OperadorService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OperadorServiceImpl implements OperadorService {


    @Override
    public String createOperador(String nombre, String codigo) {
        return null;
    }

    @Override
    public Optional<OperadorDTO> findAllOperador() {
        return Optional.empty();
    }

    @Override
    public String findById(String codigo) {
        return null;
    }
}
