package com.upc.instituto.docente.repositorio;

import com.upc.instituto.docente.entidades.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IDocenteRepositorio extends JpaRepository<Docente, Long> {

    @Query(value = "select d from Docente as d " +
            " where d.nombres like %:cad% or " +
            " d.apePaterno like %:cad% or " +
            " d.apeMaterno like %:cad% ")
    List<Docente> getBydCad(@Param("cad") String cadena);


    @Query(value = "select d from Docente as d " +
            " where d.codigo =:codigo   ")
    Docente findBydCodigo(@Param("codigo") Long cadena);

}
