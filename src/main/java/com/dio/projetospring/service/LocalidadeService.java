package com.dio.projetospring.service;

import com.dio.projetospring.model.Localidade;
import com.dio.projetospring.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {
    @Autowired
    LocalidadeRepository localidadeRepository;

    public Localidade saveLocalidade(Localidade localidade){
        return localidadeRepository.save(localidade);
    }
    public List<Localidade> findAllLocalidade(){
        return localidadeRepository.findAll();
    }
    public Optional<Localidade> getByIdLocalidade(Long idLocalidade){
        return localidadeRepository.findById(idLocalidade);
    }
    public Localidade updateLocalidade(Localidade localidade){
        return  localidadeRepository.save(localidade);
    }
    public void deleteLocalidade(Long idLocalidade){
        localidadeRepository.deleteById(idLocalidade);
    }
}
