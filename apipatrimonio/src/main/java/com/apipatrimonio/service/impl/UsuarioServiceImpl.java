package com.apipatrimonio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apipatrimonio.model.UsuarioModel;
import com.apipatrimonio.repository.UsuarioRepository;
import com.apipatrimonio.service.UsuarioSevice;

@Service
public class UsuarioServiceImpl implements UsuarioSevice {
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public UsuarioModel save(UsuarioModel usuario) {
		usuarioRepository.save(usuario);
		return usuario;
	}
}
