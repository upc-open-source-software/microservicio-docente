package com.upc.instituto.docente.entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

public interface IDocente {

    Long getCodigo();
    String getNombres();
    String getApePaterno();
    String getApeMaterno();
    Long getIdDepartamento();
    Long getIdProvincia();
    Long getIdDistrito();
    String getDireccion();
    String getCelular();
    String getUsuario();
    String getClave();
    Date getFechaNacimiento();
    Date getFechaRegistro();


}
