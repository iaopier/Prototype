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
import com.apipatrimonio.model.PatrimonioModel;
import com.apipatrimonio.model.UsuarioModel;
import com.apipatrimonio.service.MarcaService;
import com.apipatrimonio.service.PatrimonioService;

@RestController
@RequestMapping("/api/v1/")
public class ApiController {
	
	@Autowired
	PatrimonioService patrimonioService;
	
	@Autowired
	MarcaService marcaService;
	
	
	
	@RequestMapping(value = "/patrimonio", method = RequestMethod.GET)
	public ResponseEntity<?> patrimonioGet() {
		return new ResponseEntity<>(patrimonioService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/patrimonio", method = RequestMethod.POST)
	public ResponseEntity<?> patrimonioPost(@Valid @RequestBody PatrimonioModel patrimonio) {
		PatrimonioModel p = patrimonioService.save(patrimonio);
		if(p == null)
			return new ResponseEntity<>("Marca não encontrada", HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<>(patrimonioService.save(patrimonio), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/patrimonio/{id}", method = RequestMethod.PUT)
	public ResponseEntity <?> patrimonioPut(@PathVariable("id") long id,@RequestBody PatrimonioModel patrimonio) {
	   return patrimonioService.findById(id)
	           .map(record -> {
	               record.setNome(patrimonio.getNome());
	               record.setMarca_id(patrimonio.getMarca_id());
	               record.setDescricao(patrimonio.getDescricao());
	               PatrimonioModel updated = patrimonioService.save(record);
	               return ResponseEntity.ok().body(updated);
	           }).orElse(ResponseEntity.notFound().build());
	}
	
	@RequestMapping(value = "/patrimonio/{id}", method = RequestMethod.DELETE)
	public ResponseEntity <?> patrimonioDelete(@PathVariable long id) {
		   return patrimonioService.findById(id)
		           .map(record -> {
		               patrimonioService.deleteById(id);
		               return ResponseEntity.ok().build();
		           }).orElse(ResponseEntity.notFound().build());
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
	public ResponseEntity <?> marcaPut(@PathVariable("id") long id,@RequestBody MarcaModel marca) {
	   return marcaService.findById(id)
	           .map(record -> {
	               record.setNome(marca.getNome());
	               MarcaModel updated = marcaService.save(record);
	               return ResponseEntity.ok().body(updated);
	           }).orElse(ResponseEntity.notFound().build());
	}
	
	@RequestMapping(value = "/marca/{id}", method = RequestMethod.DELETE)
	public ResponseEntity <?> marcaDelte(@PathVariable long id) {
		   return marcaService.findById(id)
		           .map(record -> {
		               marcaService.deleteById(id);
		               return ResponseEntity.ok().build();
		           }).orElse(ResponseEntity.notFound().build());
	}
	
}
