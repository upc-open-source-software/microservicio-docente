package com.upc.instituto.docente.negocio;

import com.upc.instituto.docente.entidades.Docente;

import java.util.List;

public interface IDocenteNegocio {

    public Docente registrar(Docente docente);

    public Docente buscar(Long codigo) throws Exception;

    public List<Docente> listado();

    public Docente actualizar(Docente docente) throws Exception;

    public void eliminar(Long codigo) throws Exception;
}
