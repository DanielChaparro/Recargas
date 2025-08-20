package com.gelsa.recargas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecargaDTO {
    private String operador;
    private String vendedor;
    private String cliente;
}
