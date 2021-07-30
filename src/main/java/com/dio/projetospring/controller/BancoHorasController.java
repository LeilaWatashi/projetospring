package com.dio.projetospring.controller;

import com.dio.projetospring.model.BancoHoras;
import com.dio.projetospring.service.BancoHorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/bancohoras")
public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras createBancoHoras(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.saveBancoHoras(bancoHoras);
    }

    @GetMapping
    public List<BancoHoras> getBancoHorasList(){
        return bancoHorasService.findAllBancoHoras();
    }

    @GetMapping("/{idBancoHoras}")
    public ResponseEntity<BancoHoras> getBancoHorasByID
            (@PathVariable("idBancoHoras") Long idBancoHoras) throws Exception {
        return  ResponseEntity
                .ok(bancoHorasService.getByIdBancoHoras(idBancoHoras)
                        .orElseThrow(() -> new NoSuchElementException("Não Encontrado!")));
    }

    @PutMapping
    public BancoHoras updateBancoHoras(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.updateBancoHoras(bancoHoras);
    }

    @DeleteMapping("/{idBancoHoras}")
    public ResponseEntity deleteByID(@PathVariable("idBancoHoras") Long idBancoHoras) throws Exception {
        try {
            bancoHorasService.deleteBancoHoras(idBancoHoras);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<BancoHoras>) ResponseEntity.ok();
    }
}