package com.upc.instituto.docente.rest;

import com.upc.instituto.docente.entidades.Docente;
import com.upc.instituto.docente.entidades.Usuario;
import com.upc.instituto.docente.negocio.IDocenteNegocio;
import com.upc.instituto.docente.negocio.IUsuarioNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/usuario")
public class UsuarioRest {

    @Autowired
    private IUsuarioNegocio negocio;

    @PostMapping
    public Usuario registrar(@RequestBody Usuario user) {
        return this.negocio.registrar(user);
    }

    @PostMapping("validate")
    public Usuario buscarByUserAndPwd(@RequestBody Usuario user) {
        return this.negocio.validarUsuario(user);
    }


}
