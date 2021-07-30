package com.dio.projetospring.repository;

import com.dio.projetospring.model.NivelAcesso;
import com.sun.el.lang.ELArithmetic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {
}
