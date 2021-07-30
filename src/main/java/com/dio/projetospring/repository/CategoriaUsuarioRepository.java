package com.dio.projetospring.repository;

import com.dio.projetospring.model.CategoriaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long> {
}
