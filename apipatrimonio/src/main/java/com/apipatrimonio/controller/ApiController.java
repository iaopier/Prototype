package com.apipatrimonio.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apipatrimonio.model.UsuarioModel;
import com.apipatrimonio.service.UsuarioSevice;

@RestController
@RequestMapping("/api/v1/")
public class ApiController {
	@Autowired
	UsuarioSevice usuarioService;
	
	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public ResponseEntity<?> clientsPost(@Valid @RequestBody UsuarioModel usuario) {
		return new ResponseEntity<>(usuarioService.save(usuario), HttpStatus.OK);
	}
}
