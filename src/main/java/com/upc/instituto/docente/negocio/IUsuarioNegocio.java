package com.upc.instituto.docente.negocio;

import com.upc.instituto.docente.entidades.Docente;
import com.upc.instituto.docente.entidades.Usuario;

import java.util.List;

public interface IUsuarioNegocio {

    public Usuario registrar(Usuario docente);

    public Usuario validarUsuario(Usuario codigo);

    public Usuario actualizar(Usuario docente);

}
