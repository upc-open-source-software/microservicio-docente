package com.upc.instituto.docente.repositorio;

import com.upc.instituto.docente.entidades.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocenteRepositorio extends JpaRepository<Docente, Long> {
}
