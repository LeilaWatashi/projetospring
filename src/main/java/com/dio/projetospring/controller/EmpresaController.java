package com.dio.projetospring.controller;

import com.dio.projetospring.model.Empresa;
import com.dio.projetospring.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa createEmpresa (@RequestBody Empresa empresa){
        return empresaService.saveEmpresa(empresa);
    }

    @GetMapping
    public List<Empresa> getEmpresaList (){
        return empresaService.findAllEmpresa();
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> getEmpresaById(@PathVariable("idEmpresa") Long idEmpresa) throws Exception{
        return ResponseEntity
                .ok(empresaService.getByIdEmpresa(idEmpresa)
                        .orElseThrow(() -> new NoSuchElementException("Empresa não encontrada!")));
    }

    @PutMapping
    public Empresa updateEmpresa (@RequestBody Empresa empresa){
        return empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping("/{idEmpresa}")
    public ResponseEntity deleteByID(@PathVariable("idEmpresa") Long idEmpresa) {
        try {
            empresaService.deleteEmpresa(idEmpresa);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Empresa>) ResponseEntity.ok();
    }

}
