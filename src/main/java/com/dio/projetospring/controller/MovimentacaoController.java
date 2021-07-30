package com.dio.projetospring.controller;


import com.dio.projetospring.model.Movimentacao;
import com.dio.projetospring.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao createMovimentacao (@RequestBody Movimentacao movimentacao){
        return movimentacaoService.saveMovimentacao(movimentacao);
    }

    @GetMapping
    public List<Movimentacao> getMovimentacaoList(){
        return movimentacaoService.findAllMovimentacao();
    }

    @GetMapping("/{idMovimentacao}")
    public ResponseEntity <Movimentacao> getMovimentacaoById(@PathVariable("idMovimentacao") Long idMovimentacao){
        return ResponseEntity
                .ok(movimentacaoService.getByIdMovimentacao(idMovimentacao)
                        .orElseThrow(() -> new NoSuchElementException("Movimentação não encontrada")));
    }

    @PutMapping
    public  Movimentacao updateMovimentacao (@RequestBody Movimentacao movimentacao){
        return movimentacaoService.updateMovimentacao(movimentacao);
    }

    @DeleteMapping("/{idMovimentacao}")
    public ResponseEntity deleteById(@PathVariable("idMovimentacao") Long idMovimentacao){
        try{
            movimentacaoService.deleteMovimentacao(idMovimentacao);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Movimentacao>) ResponseEntity.ok();
    }
}
