package com.dio.projetospring.service;

import com.dio.projetospring.model.CategoriaUsuario;
import com.dio.projetospring.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

    CategoriaUsuarioRepository categoriaUsuarioRepository;

    @Autowired
    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository){
        this.categoriaUsuarioRepository = categoriaUsuarioRepository;
    }

    public CategoriaUsuario saveCategoriaUsuario(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public List<CategoriaUsuario> findAllCategoriaUsuario() {
        return   categoriaUsuarioRepository.findAll();
    }

    public Optional<CategoriaUsuario> getByIdCategoriaUsuario(Long idCategoriaUsuario) {
        return categoriaUsuarioRepository.findById(idCategoriaUsuario);
    }

    public CategoriaUsuario updateCategoriaUsuario(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);

    }

    public void deleteCategoriaUsuario(Long idCategoriaUsuario) {
        categoriaUsuarioRepository.deleteById(idCategoriaUsuario);
    }

}
