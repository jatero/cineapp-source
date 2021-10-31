package com.jatero.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jatero.app.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

}
