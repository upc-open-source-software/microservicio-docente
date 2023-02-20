package com.upc.instituto.docente.entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "TBL_DOCENTE")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long codigo;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "ape_paterno")
    private String apePaterno;
    @Column(name = "ape_materno")
    private String apeMaterno;
    @Column(name = "iddepartamento")
    private Long iddepartamento;
    @Column(name = "idprovincia")
    private Long idprovincia;
    @Column(name = "iddistrito")
    private Long iddistrito;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "celular")
    private String celular;
    // ================================
    @Column(name = "fech_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "fech_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;


}
