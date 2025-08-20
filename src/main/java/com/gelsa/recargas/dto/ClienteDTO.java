package com.gelsa.recargas.dto;

import com.gelsa.recargas.model.Operador;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
    private String name;
    private String numero;
    private String operador;
}
