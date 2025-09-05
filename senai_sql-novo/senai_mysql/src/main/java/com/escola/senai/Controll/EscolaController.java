package com.escola.senai.Controll;

import com.escola.senai.Models.Escola;
import com.escola.senai.Service.EscolaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("escola")
public class EscolaController {
    private final EscolaService escolaService;

    public EscolaController(EscolaService escolaService) {
        this.escolaService = escolaService;
    }

    @GetMapping
    public List<Escola> buscarEscola(){
        return escolaService.buscarTodasEscolas();
    }


    @PostMapping
    public Escola salvar(@RequestBody Escola escola){
        return escolaService.salvarNovoEscola(escola);
    }
    
    @PutMapping("/{id}")
    public Escola atualizarEscola(@PathVariable Long id, @RequestBody Escola novoEscola){
        Escola verificaEscola = escolaService.buscarEscolaId(id);
        if (verificaEscola==null) return null;

        verificaEscola.setNome(novoEscola.getNome());
        verificaEscola.setEmail(novoEscola.getEmail());
        verificaEscola.setTelefone(novoEscola.getTelefone());

        verificaEscola.setCnpj(novoEscola.getCnpj());
        verificaEscola.setDisciplinas(novoEscola.getDisciplinas());
        verificaEscola.setTurmas(novoEscola.getTurmas());
        verificaEscola.setStatusAluno(novoEscola.getStatusAluno());

        return escolaService.salvarNovoEscola(verificaEscola);
    }
    
    @GetMapping("/{id}")
    public Escola buscaEscolaId(@PathVariable Long id){
        return escolaService.buscarEscolaId(id);
    }


    @DeleteMapping("/{id}")
    public void excluirEscola(@PathVariable Long id){
        escolaService.deletarEscola(id);
    }




}

