package com.dio.projetospring.controller;

import com.dio.projetospring.model.NivelAcesso;
import com.dio.projetospring.service.NivelAcessoService;
import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/nivelacesso")
public class NivelAcessoController {
    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.saveNivelAcesso(nivelAcesso);
    }

    @GetMapping
    public List<NivelAcesso> getNivelAcessoList() {
        return nivelAcessoService.findAllNivelAcesso();
    }

    @GetMapping("/{idNivelAcesso}")
    public ResponseEntity<NivelAcesso> getNivelAcessoById(@PathVariable("idNivelAcesso") Long idNivelAcesso) throws Exception {
        return ResponseEntity
                .ok(nivelAcessoService.findByIdNivelAcesso(idNivelAcesso)
                        .orElseThrow(() -> new NoSuchElementException("Nível de acesso não encontrado!")));
    }

    @PutMapping
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcesso) {
        return nivelAcessoService.updateNivelAcesso(nivelAcesso);
    }

    @DeleteMapping("/{idNivelAcesso}")
    public ResponseEntity deleteById(@PathVariable ("idNivelAcesso") Long idNivelAcesso){
        try{
            nivelAcessoService.deleteNivelAcesso(idNivelAcesso);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();
    }
}
