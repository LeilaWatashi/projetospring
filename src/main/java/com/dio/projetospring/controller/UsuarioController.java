package com.dio.projetospring.controller;

import com.dio.projetospring.model.Usuario;
import com.dio.projetospring.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public Usuario createUsuario(Usuario usuario){
        return usuarioService.saveUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> getUsuarioList(){
        return usuarioService.findAllUsuario();
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("idUsuario") Long idUsuario){
        return ResponseEntity
                .ok(usuarioService.getByIdUsuario(idUsuario)
                .orElseThrow(() -> new NoSuchElementException("Usuário não encontrado!")));
    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return  usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    public ResponseEntity deleteById(@PathVariable("idUsuario") Long idUsuario){
        try{
            usuarioService.deleteUsuario(idUsuario);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Usuario>) ResponseEntity.ok();
    }
}
