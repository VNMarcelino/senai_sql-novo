package com.escola.senai.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Escola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;
    private String nome;
    private String email;
    private String telefone;

    private String Disciplinas;
    private String Cnpj;
    private String Turmas;
    private Boolean StatusAluno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getStatusAluno() {
        return StatusAluno;
    }

    public void setStatusAluno(Boolean statusAluno) {
        StatusAluno = statusAluno;
    }

    public String getTurmas() {
        return Turmas;
    }

    public void setTurmas(String turmas) {
        Turmas = turmas;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    public String getDisciplinas() {
        return Disciplinas;
    }

    public void setDisciplinas(String disciplinas) {
        Disciplinas = disciplinas;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
