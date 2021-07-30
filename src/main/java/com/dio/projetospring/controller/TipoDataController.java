package com.dio.projetospring.controller;

import com.dio.projetospring.model.TipoData;
import com.dio.projetospring.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.image.TileObserver;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/tipodata")
public class TipoDataController {
    @Autowired
    TipoDataService tipoDataService;

    @PostMapping
    public TipoData createTipoData(TipoData tipoData){
        return tipoDataService.saveTipoData(tipoData);
    }

    @GetMapping
    public List<TipoData> getAllTipoData(){
        return tipoDataService.findAllTipoData();
    }

    @GetMapping("/{idTipoData}")
    public ResponseEntity<TipoData> getByIdTipoData(@PathVariable("idTipoData") Long idTipoData){
        return ResponseEntity
                .ok(tipoDataService.findByIdTipoData(idTipoData)
                .orElseThrow(() -> new NoSuchElementException("Data não encontrada!")));
    }

    @PutMapping
    public TipoData updateTipoData(TipoData tipoData){
        return tipoDataService.updateTipoData(tipoData);
    }

    @DeleteMapping("/{idTipoData}")
    public ResponseEntity deleteById(@PathVariable("idTipoData") Long idTipoData){
        try{
            tipoDataService.deleteTipoData(idTipoData);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<TipoData>) ResponseEntity.ok();
    }

}
