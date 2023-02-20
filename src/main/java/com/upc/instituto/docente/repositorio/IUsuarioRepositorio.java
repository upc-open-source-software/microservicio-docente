package com.upc.instituto.docente.repositorio;

import com.upc.instituto.docente.entidades.Docente;
import com.upc.instituto.docente.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUsuarioRepositorio extends JpaRepository<Usuario, Long> {

     Usuario findUsuarioByUsuarioAndClave(String user,String clav);
     Usuario findUsuarioByIddocente(long user);
}
