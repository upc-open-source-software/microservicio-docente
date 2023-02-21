package com.upc.instituto.docente.rest;

import com.upc.instituto.docente.entidades.Docente;
import com.upc.instituto.docente.entidades.DocenteRegistro;
import com.upc.instituto.docente.entidades.IDocente;
import com.upc.instituto.docente.negocio.IDocenteNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/docentes")
public class DocenteRest {

    @Autowired
    private IDocenteNegocio docenteNegocio;

    @GetMapping
    public List<Docente> listado() {
        return this.docenteNegocio.listado();
    }

    @PostMapping
    public Docente registrar(@RequestBody DocenteRegistro docente) {
        return this.docenteNegocio.registrar(docente);
    }

    @GetMapping("/{codigo}")
    public Docente buscar(@PathVariable("codigo") Long codigo) {
        try {
            return this.docenteNegocio.buscar(codigo);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Docente no existe en la base de datos", e);
        }
    }

    @GetMapping("/byCad")
    public List<Docente> buscarByCad(@RequestParam("cad") String cad) {
        try {
            return this.docenteNegocio.buscarByCad(cad.toUpperCase());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @PutMapping("/{codigo}")
    public Docente actualizar(@RequestBody Docente docente, @PathVariable("codigo") Long codigo) throws Exception {
        try {
            docente.setCodigo(codigo);
            return this.docenteNegocio.actualizar(docente);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Docente no existe en la base de datos", e);
        }
    }

    @GetMapping("/disable/{codigo}")
    public Docente eliminar(@PathVariable("codigo") Long codigo) {
        return this.docenteNegocio.eliminar(codigo);
    }
}
