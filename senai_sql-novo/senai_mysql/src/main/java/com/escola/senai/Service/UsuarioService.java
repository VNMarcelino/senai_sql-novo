package com.escola.senai.Service;

import com.escola.senai.Interace.UsarioRepository;
import com.escola.senai.Models.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsarioRepository repository;


    public UsuarioService(UsarioRepository repository) {
        this.repository = repository;
    }

    public Usuario fazerlogin(String username, String senha) {
        return repository.findByUsernameAndSenha(username, senha).orElse(null);
    }

    public Usuario salvarusuario(Usuario user) {
        return repository.save(user);

    }
}
