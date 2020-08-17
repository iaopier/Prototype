package com.apipatrimonio.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.apipatrimonio.model.UsuarioModel;
import com.apipatrimonio.repository.UsuarioRepository;


@Service
public class JwtUserDetailsService implements UserDetailsService {
	@Autowired
	UsuarioRepository usuarioRepository;

	public UsuarioModel save(UsuarioModel usuario) {
		usuarioRepository.save(usuario);
		return usuario;
	}

	@Override
	public UserDetails loadUserByUsername(String username) {
		UsuarioModel user = usuarioRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				new ArrayList<>());
	}
}
