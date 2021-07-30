package com.dio.projetospring.service;

import com.dio.projetospring.model.Empresa;
import com.dio.projetospring.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public Empresa saveEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAllEmpresa(){
        return empresaRepository.findAll();
    }

    public Optional<Empresa> getByIdEmpresa(Long idEmpresa){
        return  empresaRepository.findById(idEmpresa);
    }

    public Empresa updateEmpresa (Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public void deleteEmpresa (Long idEmpresa){
        empresaRepository.deleteById(idEmpresa);
    }
}
