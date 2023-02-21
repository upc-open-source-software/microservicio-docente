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
    private Long idDepartamento;
    private Long idProvincia;
    private Long idDistrito;
    private String direccion;
    private String celular;
    private String correo;

    private String usuario;
    private String clave;
    // ================================
    private Date fechaNacimiento;
    private Date fechaRegistro;


}
