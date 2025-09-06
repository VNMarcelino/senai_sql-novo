package com.escola.senai.Interace;

import com.escola.senai.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByUsernameAndSenha (String username, String senha);

}
