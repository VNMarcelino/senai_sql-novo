package com.escola.senai.Interace;

import com.escola.senai.Models.Escola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscolaRepository extends JpaRepository<Escola, Long> {
}
