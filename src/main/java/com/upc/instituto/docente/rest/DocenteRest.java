package com.upc.instituto.docente.rest;

import com.upc.instituto.docente.entidades.Docente;
import com.upc.instituto.docente.negocio.IDocenteNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/docentes")
public class DocenteRest {

    @Autowired
    private IDocenteNegocio docenteNegocio;

    @GetMapping
    public List<Docente> listado() {
        return this.docenteNegocio.listado();
    }

    @PostMapping
    public Docente registrar(@RequestBody Docente docente) {
        return this.docenteNegocio.registrar(docente);
    }

    @GetMapping("/{id}")
    public Docente buscar(@PathVariable("id") Long codigo) {
        try {
            return this.docenteNegocio.buscar(codigo);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Docente no existe en la base de datos", e);
        }
    }

    @PutMapping("/{id}")
    public Docente actualizar(@RequestBody Docente docente, @PathVariable("id") Long codigo) throws Exception {
        try {
            docente.setCodigo(codigo);
            return this.docenteNegocio.actualizar(docente);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Docente no existe en la base de datos", e);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable("id") Long codigo) throws Exception {
        try {
            this.docenteNegocio.eliminar(codigo);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Docente no existe en la base de datos", e);
        }
    }
}
