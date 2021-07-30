package com.dio.projetospring.service;

import com.dio.projetospring.model.NivelAcesso;
import com.dio.projetospring.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {
    @Autowired
    NivelAcessoRepository nivelAcessoRepository;
    public NivelAcesso saveNivelAcesso(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }
    public List<NivelAcesso> findAllNivelAcesso(){
        return nivelAcessoRepository.findAll();
    }
    public Optional<NivelAcesso> findByIdNivelAcesso(Long idNivelAcesso){
        return nivelAcessoRepository.findById(idNivelAcesso);
    }
    public NivelAcesso updateNivelAcesso(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }
    public void deleteNivelAcesso(Long idNivelAcesso){
        nivelAcessoRepository.deleteById(idNivelAcesso);
    }
}
