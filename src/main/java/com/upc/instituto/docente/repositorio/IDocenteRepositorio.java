package com.upc.instituto.docente.repositorio;

import com.upc.instituto.docente.entidades.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IDocenteRepositorio extends JpaRepository<Docente, Long> {

    @Query(value = "select d from Docente as d " +
            " where  UPPER(d.nombres) like %:cad% or " +
            " UPPER(d.apePaterno) like %:cad% or " +
            "  UPPER(d.apeMaterno) like %:cad% and d.activo=1 ")
    List<Docente> getBydCad(@Param("cad") String cadena);


    @Query(value = "select d from Docente as d " +
            " where d.codigo =:codigo   ")
    Docente findBydCodigo(@Param("codigo") Long cadena);

    List<Docente> findAllByActivo(int activo);
}
