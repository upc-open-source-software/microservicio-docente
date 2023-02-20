package com.upc.instituto.docente.entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "TBL_USUARIO_DOCENTE")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long codigo;
    @Column(name = "id_docente")
    private Long iddocente;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "clave")
    private String clave;
    @Column(name = "fech_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;


}
