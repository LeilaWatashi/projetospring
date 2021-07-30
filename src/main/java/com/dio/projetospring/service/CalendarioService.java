package com.dio.projetospring.service;

import com.dio.projetospring.model.Calendario;
import com.dio.projetospring.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {

    CalendarioRepository calendarioRepository;

    @Autowired
    public CalendarioService(CalendarioRepository calendarioRepository){
        this.calendarioRepository = calendarioRepository;
    }

    public Calendario saveCalendario(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public List<Calendario> findAllCalendario() {
        return   calendarioRepository.findAll();
    }


    public Calendario updateCalendario(Calendario calendario){
        return calendarioRepository.save(calendario);

    }

    public void deleteCalendario(Long idCalendario) {
        calendarioRepository.deleteById(idCalendario);
    }
}
