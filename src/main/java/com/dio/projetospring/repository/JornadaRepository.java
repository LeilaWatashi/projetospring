package com.dio.projetospring.repository;

import com.dio.projetospring.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository <JornadaTrabalho, Long> {
}
