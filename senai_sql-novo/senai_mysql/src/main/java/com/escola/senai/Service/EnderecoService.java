//package com.escola.senai.Service;
//
//import com.escola.senai.Interace.EnderecoRepository;
//import com.escola.senai.Models.Endereco;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EnderecoService {
//    private final EnderecoRepository repository;
//
//
//    public EnderecoService(EnderecoRepository repository) {
//        this.repository = repository;
//    }
//
//    public List<Endereco> buscarTodosEndereco() {
//        return repository.findAll();
//    }
//
//    public Endereco salvarNovoEndereco(Endereco endereco) {
//      return repository.save(endereco);
//    }
//
//    public Endereco buscarEnderecoId(Long id) {
//        return repository.findById(id).orElse((null));
//    }
//
//    public void deletarEndereco(long id){
//        repository.deleteById(id);
//    }
//
//
//
//}
