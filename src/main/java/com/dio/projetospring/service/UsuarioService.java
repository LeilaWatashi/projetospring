package com.dio.projetospring.service;

import com.dio.projetospring.model.Usuario;
import com.dio.projetospring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    public Usuario saveUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> findAllUsuario(){
        return usuarioRepository.findAll();
    }
    public Optional<Usuario> getByIdUsuario(Long idUsuario){
        return usuarioRepository.findById(idUsuario);
    }
    public Usuario updateUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public void deleteUsuario(Long idUsuario){
        usuarioRepository.deleteById(idUsuario);
    }
}
