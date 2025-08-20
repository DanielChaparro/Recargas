package com.gelsa.recargas.repository;

import com.gelsa.recargas.model.Recarga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecargaRepository extends JpaRepository<Recarga, Long> {
}
