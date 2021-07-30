package com.dio.projetospring.controller;

import com.dio.projetospring.model.Localidade;
import com.dio.projetospring.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {

    @Autowired
    LocalidadeService localidadeService;

    @PostMapping
    public Localidade createLocalidade(@RequestBody Localidade localidade) {
        return localidadeService.saveLocalidade(localidade);
    }

    @GetMapping
    public List<Localidade> getLocalidadeList() {
        return localidadeService.findAllLocalidade();
    }

    @GetMapping("/{idLocalidade}")
    public ResponseEntity<Localidade> getLocalidadeById(@PathVariable("idLocalidade") Long idLocalidade) throws Exception {
        return ResponseEntity
                .ok(localidadeService.getByIdLocalidade(idLocalidade)
                        .orElseThrow(() -> new NoSuchElementException("Localidade não encontrada!")));
    }

    @PutMapping
    public Localidade updateLocalidade(@RequestBody Localidade localidade){
        return localidadeService.updateLocalidade(localidade);
    }

    @DeleteMapping("/{idLocalidade}")
    public ResponseEntity deleteById(@PathVariable ("idLocalidade") Long idLocalidade){
        try{
            localidadeService.deleteLocalidade(idLocalidade);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Localidade>) ResponseEntity.ok();
    }
}


