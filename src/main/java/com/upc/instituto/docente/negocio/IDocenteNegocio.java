package com.upc.instituto.docente.negocio;

import com.upc.instituto.docente.entidades.Docente;
import com.upc.instituto.docente.entidades.DocenteRegistro;
import com.upc.instituto.docente.entidades.IDocente;

import java.util.List;

public interface IDocenteNegocio {

    public Docente registrar(DocenteRegistro docente);

    public Docente buscar(Long codigo) throws Exception;
    public List<Docente>  buscarByCad(String cad) throws Exception;

    public List<Docente> listado();

    public Docente actualizar(Docente docente) throws Exception;

    public Docente eliminar(Long codigo)  ;
}
