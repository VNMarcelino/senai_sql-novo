package com.escola.senai.Controll;

import com.escola.senai.Models.Usuario;
import com.escola.senai.Service.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Usuarios")
public class AuthController {
    private final UsuarioService usuarioService;

    public AuthController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping ("/login")
    public String login (@RequestBody Usuario usuario){
        Usuario user =usuarioService.fazerlogin(usuario.getUsername(),usuario.getSenha());
        if (user != null){
            return "loginok" + user.getUsername();
        }
        return "usuarioinvalido";
    }


    @PostMapping ("/register")
    public Usuario register (@RequestBody Usuario usuario) {
        return usuarioService.salvarusuario(usuario);
    }

}

