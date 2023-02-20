package com.upc.instituto.docente.entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class DocenteRegistro {

    private Long codigo;
    private String nombres;
    private String apePaterno;
    private String apeMaterno;
    private Long iddepartamento;
    private Long idprovincia;
    private Long iddistrito;
    private String direccion;
    private String celular;

    private String usuario;
    private String clave;
    // ================================
    private String fechaNacimiento;
    private Date fechaRegistro;


}
