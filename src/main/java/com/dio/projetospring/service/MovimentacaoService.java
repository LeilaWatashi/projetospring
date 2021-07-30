package com.dio.projetospring.service;

import com.dio.projetospring.model.Movimentacao;
import com.dio.projetospring.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {
    @Autowired
    MovimentacaoRepository movimentacaoRepository;

    public Movimentacao saveMovimentacao(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }
    public List<Movimentacao> findAllMovimentacao() {
        return movimentacaoRepository.findAll();
    }
    public Optional<Movimentacao> getByIdMovimentacao(Long idMovimentacao) {
        return movimentacaoRepository.findById(idMovimentacao);
    }
    public Movimentacao updateMovimentacao (Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }
    public void deleteMovimentacao (Long idMovimetacao){
        movimentacaoRepository.deleteById(idMovimetacao);
    }
}