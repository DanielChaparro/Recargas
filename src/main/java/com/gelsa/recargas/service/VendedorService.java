package com.gelsa.recargas.service;

import com.gelsa.recargas.dto.VendedorDTO;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface VendedorService {
    String createVendedor(String name, String codigo);
    Optional<VendedorDTO> listAllVendedores();
    String getByCodigo(String codigo);
}
