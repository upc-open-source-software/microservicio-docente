package com.upc.instituto.docente.negocio;

import com.upc.instituto.docente.entidades.Docente;
import com.upc.instituto.docente.entidades.DocenteRegistro;
import com.upc.instituto.docente.entidades.IDocente;
import com.upc.instituto.docente.entidades.Usuario;
import com.upc.instituto.docente.repositorio.IDocenteRepositorio;
import com.upc.instituto.docente.repositorio.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteNegocio implements IDocenteNegocio {

    @Autowired
    private IDocenteRepositorio iDocenteRepositorio;
    @Autowired
    private IUsuarioRepositorio iUsuarioRepositorio;

    @Override
    public Docente registrar(DocenteRegistro docente) {

        Usuario usuario = new Usuario();
        usuario.setUsuario(docente.getUsuario());
        usuario.setClave(docente.getClave());
        iUsuarioRepositorio.save(usuario);


        Docente obj = new Docente();
        ///obj.setCodigo(docente.getCodigo());
        obj.setNombres(docente.getNombres());
        obj.setApePaterno(docente.getApePaterno());
        obj.setApeMaterno(docente.getApeMaterno());
        obj.setIddepartamento(docente.getIddepartamento());
        obj.setIdprovincia(docente.getIdprovincia());
        obj.setIddistrito(docente.getIddistrito());
        obj.setDireccion(docente.getDireccion());
        obj.setCelular(docente.getCelular());
        obj.setFechaNacimiento(null);
        obj.setFechaRegistro(docente.getFechaRegistro());

        return iDocenteRepositorio.save(obj);
    }

    @Override
    public Docente buscar(Long codigo) throws Exception {

        Usuario usuario = iUsuarioRepositorio.findUsuarioByIddocente(codigo);

        Docente docente = iDocenteRepositorio.findBydCodigo(codigo);
        if (usuario != null && docente != null) {

            //docente.setUsuario(usuario.getUsuario());
            return docente;
        }
        return null;
    }

    @Override
    public List<Docente> buscarByCad(String cad) {
        return iDocenteRepositorio.getBydCad(cad);
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
