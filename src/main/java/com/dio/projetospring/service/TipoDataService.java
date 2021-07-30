package com.dio.projetospring.service;

import com.dio.projetospring.model.TipoData;
import com.dio.projetospring.repository.TipoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {
    @Autowired
    TipoDataRepository tipoDataRepository;

    public TipoData saveTipoData(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }
    public List<TipoData> findAllTipoData(){
        return tipoDataRepository.findAll();
    }
    public Optional<TipoData> findByIdTipoData(Long idTipoData){
        return tipoDataRepository.findById(idTipoData);
    }
    public TipoData updateTipoData(TipoData tipoData){
        return tipoDataRepository.save(tipoData);
    }
    public void deleteTipoData(Long idTipodata){
        tipoDataRepository.deleteById(idTipodata);
    }
}
