package com.upc.instituto.docente.negocio;

import com.upc.instituto.docente.entidades.Docente;
import com.upc.instituto.docente.entidades.Usuario;
import com.upc.instituto.docente.repositorio.IDocenteRepositorio;
import com.upc.instituto.docente.repositorio.IUsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioNegocio implements IUsuarioNegocio {

    @Autowired
    private IUsuarioRepositorio iUsuarioRepositorio;

    @Override
    public Usuario registrar(Usuario docente) {
        return iUsuarioRepositorio.save(docente);
    }

    @Override
    public Usuario validarUsuario(Usuario user) {
        return iUsuarioRepositorio.findUsuarioByUsuarioAndClave(user.getUsuario(), user.getClave());
    }

    @Override
    public Usuario actualizar(Usuario docente) {
        return null;
    }

}
