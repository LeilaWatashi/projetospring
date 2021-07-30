package com.dio.projetospring.service;

import com.dio.projetospring.model.Ocorrencia;
import com.dio.projetospring.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {
    @Autowired
    OcorrenciaRepository ocorrenciaRepository;
    public Ocorrencia saveOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }
    public List<Ocorrencia> findAllOcorrencia(){
        return ocorrenciaRepository.findAll();
    }
    public Optional<Ocorrencia> getByIdOcorrencia(Long idOcorrencia){
        return ocorrenciaRepository.findById(idOcorrencia);
    }
    public Ocorrencia updateOcorrencia(Ocorrencia ocorrencia){
        return ocorrenciaRepository.save(ocorrencia);
    }
    public void deleteOcorrencia(Long idOcorrencia){
        ocorrenciaRepository.deleteById(idOcorrencia);
    }
}
