package com.apipatrimonio.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apipatrimonio.model.MarcaModel;
import com.apipatrimonio.repository.MarcaRepository;
import com.apipatrimonio.service.MarcaService;


@Service
public class MarcaServiceImpl implements MarcaService {
	
	@Autowired
	MarcaRepository marcaRepository;

	public List<MarcaModel> findAll(){
		return marcaRepository.findAll();
	}
	
	public MarcaModel save(MarcaModel marca) {
		marcaRepository.save(marca);
		return marca;
		
	}
	
	public Optional<MarcaModel> findById(long id) {
		return marcaRepository.findById(id);
	}
	
}
