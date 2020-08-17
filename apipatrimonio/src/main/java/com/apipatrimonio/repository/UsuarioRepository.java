package com.apipatrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apipatrimonio.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

}
