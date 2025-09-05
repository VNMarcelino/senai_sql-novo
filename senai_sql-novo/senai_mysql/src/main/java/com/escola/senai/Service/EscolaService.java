package com.escola.senai.Service;

import com.escola.senai.Interace.EscolaRepository;
import com.escola.senai.Models.Aluno;
import com.escola.senai.Models.Escola;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscolaService {

    private final EscolaRepository repository;

    public EscolaService(EscolaRepository repository) {
        this.repository = repository;
    }


    public List<Escola> buscarTodasEscolas() {
        return repository.findAll();
    }

    public Escola salvarNovoEscola(Escola escola) {
      return repository.save(escola);
    }

    public Escola buscarEscolaId(Long id) {
        return repository.findById(id).orElse((null));
    }

    public void deletarEscola(long id){
        repository.deleteById(id);
    }



}
