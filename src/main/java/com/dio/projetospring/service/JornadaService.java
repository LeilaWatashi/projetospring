package com.dio.projetospring.service;

import com.dio.projetospring.model.JornadaTrabalho;
import com.dio.projetospring.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;
    @Autowired
    public JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAllJornada() {
        return   jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getByIdJornada(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);

    }

    public void deleteJornada(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }

}


