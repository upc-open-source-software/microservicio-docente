package com.upc.instituto.docente.negocio;

import com.upc.instituto.docente.entidades.Docente;
import com.upc.instituto.docente.repositorio.IDocenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteNegocio implements IDocenteNegocio {

    @Autowired
    private IDocenteRepositorio iDocenteRepositorio;

    @Override
    public Docente registrar(Docente docente) { return iDocenteRepositorio.save(docente); }

    @Override
    public Docente buscar(Long codigo) throws Exception {
        return iDocenteRepositorio.findById(codigo).orElseThrow(
                () -> new Exception("No se encontró la entidad"));
    }

    @Override
    public List<Docente> listado() {
        return iDocenteRepositorio.findAll();
    }

    @Override
    public Docente actualizar(Docente Docente) throws Exception {
        this.buscar(Docente.getCodigo());
        return iDocenteRepositorio.save(Docente);
    }

    @Override
    public void eliminar(Long codigo) throws Exception {
        this.buscar(codigo);
        iDocenteRepositorio.deleteById(codigo);
    }
}
