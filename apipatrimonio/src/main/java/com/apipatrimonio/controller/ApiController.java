package com.apipatrimonio.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apipatrimonio.model.MarcaModel;
import com.apipatrimonio.model.UsuarioModel;
import com.apipatrimonio.service.MarcaService;
import com.apipatrimonio.service.PatrimonioService;
import com.apipatrimonio.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/")
public class ApiController {
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	PatrimonioService patrimonioService;
	
	@Autowired
	MarcaService marcaService;
	
	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public ResponseEntity<?> usuarioPost(@Valid @RequestBody UsuarioModel usuario) {
		return new ResponseEntity<>(usuarioService.save(usuario), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/patrimonio", method = RequestMethod.GET)
	public ResponseEntity<?> patrimonioGet() {
		return new ResponseEntity<>(patrimonioService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/marca", method = RequestMethod.GET)
	public ResponseEntity<?> marcaGet() {
		return new ResponseEntity<>(marcaService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/marca", method = RequestMethod.POST)
	public ResponseEntity<?> marcaPost(@Valid @RequestBody MarcaModel marca) {
		return new ResponseEntity<>(marcaService.save(marca), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/marca/{id}", method = RequestMethod.PUT)
	public ResponseEntity <?>update(@PathVariable("id") long id,@RequestBody MarcaModel marca) {
	   return marcaService.findById(id)
	           .map(record -> {
	               record.setNome(marca.getNome());
	               MarcaModel updated = marcaService.save(record);
	               return ResponseEntity.ok().body(updated);
	           }).orElse(ResponseEntity.notFound().build());
	}
	
	@RequestMapping(value = "/marca/{id}", method = RequestMethod.DELETE)
	public ResponseEntity <?> delete(@PathVariable long id) {
		   return marcaService.findById(id)
		           .map(record -> {
		               marcaService.deleteById(id);
		               return ResponseEntity.ok().build();
		           }).orElse(ResponseEntity.notFound().build());
		}
	
}
