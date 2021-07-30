package com.dio.projetospring.controller;

import com.dio.projetospring.model.CategoriaUsuario;
import com.dio.projetospring.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categoriausuario")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario createCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.saveCategoriaUsuario(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getCategoriaUsuarioList(){
        return categoriaUsuarioService.findAllCategoriaUsuario();
    }

    @GetMapping("/{idCategoriaUsuario}")
    public ResponseEntity<CategoriaUsuario> getCategoriaUsuarioByID
            (@PathVariable("idCategoriaUsuario") Long idCategoriaUsuario) throws Exception {
        return  ResponseEntity
                .ok(categoriaUsuarioService.getByIdCategoriaUsuario(idCategoriaUsuario)
                        .orElseThrow(() -> new NoSuchElementException("Não Encontrado!")));
    }

    @PutMapping
    public CategoriaUsuario updateCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.updateCategoriaUsuario(categoriaUsuario);
    }

    @DeleteMapping("/{idCategoriaUsuario}")
    public ResponseEntity deleteByID(@PathVariable("idJCategoriaUsuario") Long idCategoriaUsuario) throws Exception {
        try {
            categoriaUsuarioService.deleteCategoriaUsuario(idCategoriaUsuario);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<CategoriaUsuario>) ResponseEntity.ok();

    }
}
