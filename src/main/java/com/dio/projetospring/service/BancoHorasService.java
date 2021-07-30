package com.dio.projetospring.service;

import com.dio.projetospring.model.BancoHoras;
import com.dio.projetospring.repository.BancoHorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {
    BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService (BancoHorasRepository bancoHorasRepository){
        this.bancoHorasRepository = bancoHorasRepository;
    }

    public BancoHoras saveBancoHoras(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public List<BancoHoras> findAllBancoHoras() {
        return   bancoHorasRepository.findAll();
    }

    public Optional<BancoHoras> getByIdBancoHoras(Long idBancoHoras) {
        return bancoHorasRepository.findById(idBancoHoras);
    }

    public BancoHoras updateBancoHoras(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);

    }

    public void deleteBancoHoras(Long idBancoHoras) {
        bancoHorasRepository.deleteById(idBancoHoras);
    }

}
