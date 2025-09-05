package com.escola.senai.Controll;

import com.escola.senai.Models.Endereco;
import com.escola.senai.Service.EnderecoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("endereco")
public class EnderecoController {
    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping
    public List<Endereco> buscarEndereco(){
        return enderecoService.buscarTodosEndereco();
    }


    @PostMapping
    public Endereco salvar(@RequestBody Endereco endereco){
        return enderecoService.salvarNovoEndereco(endereco);
    }
    
    @PutMapping("/{id}")
    public Endereco atualizarendereco(@PathVariable Long id, @RequestBody Endereco novoEndereco){
        Endereco verificaendereco = enderecoService.buscarEnderecoId(id);
        if (verificaendereco==null) return null;

        verificaendereco.setCep(novoEndereco.getNome());
        verificaendereco.setLogradouro(novoEndereco.getEmail());
        verificaendereco.setComplemento(novoEndereco.getTelefone());
        return enderecoService.salvarNovoEndereco(verificaendereco);
    }
    
    @GetMapping("/{id}")
    public Endereco buscaEnderecoId(@PathVariable Long id){
        return enderecoService.buscarEnderecoId(id);
    }


    @DeleteMapping("/{id}")
    public void excluirEndereco(@PathVariable Long id){
        enderecoService.deletarEndereco(id);
    }




}

