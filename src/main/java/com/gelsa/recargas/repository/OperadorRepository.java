package com.gelsa.recargas.repository;

import com.gelsa.recargas.model.Operador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperadorRepository extends JpaRepository<Operador, Long> {
}
