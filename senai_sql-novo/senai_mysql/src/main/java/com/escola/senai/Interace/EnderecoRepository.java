package com.escola.senai.Interace;

import com.escola.senai.Models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmderecoRepository extends JpaRepository<Aluno, Long> {
}
