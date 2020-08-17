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

	@Override
	public List<MarcaModel> findAll(){
		return marcaRepository.findAll();
	}
	
	@Override
	public MarcaModel save(MarcaModel marca) {
		marcaRepository.save(marca);
		return marca;
		
	}
	
	@Override
	public Optional<MarcaModel> findById(long id) {
		return marcaRepository.findById(id);
	}

	@Override
	public void deleteById(long id) {
		marcaRepository.deleteById(id);
		
	}
	
}
