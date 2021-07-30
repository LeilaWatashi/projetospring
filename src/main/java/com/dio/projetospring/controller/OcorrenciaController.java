package com.dio.projetospring.controller;

import com.dio.projetospring.model.Ocorrencia;
import com.dio.projetospring.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {
    @Autowired
    OcorrenciaService ocorrenciaService;

    @PostMapping
    public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.saveOcorrencia(ocorrencia);
    }

    @GetMapping
    public List<Ocorrencia> getOcorrenciaList(){
        return ocorrenciaService.findAllOcorrencia();
    }

    @GetMapping("/{idOcorrencia}")
    public ResponseEntity<Ocorrencia> getOcorrenciaById(@PathVariable("idOcorrencia") Long idOcorrencia){
        return ResponseEntity
                .ok(ocorrenciaService.getByIdOcorrencia(idOcorrencia)
                   .orElseThrow(() -> new NoSuchElementException("Ocorrencia não encontrada!")));
    }

    @PutMapping
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.updateOcorrencia(ocorrencia);
    }

    @DeleteMapping("/{idOcorrencia}")
    public ResponseEntity deleteById(@PathVariable("idOcorrencia") Long idOcorrencia){
        try{
            ocorrenciaService.deleteOcorrencia(idOcorrencia);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Ocorrencia>) ResponseEntity.ok();
    }

}
