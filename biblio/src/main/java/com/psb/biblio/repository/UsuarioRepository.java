package com.psb.biblio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psb.biblio.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
