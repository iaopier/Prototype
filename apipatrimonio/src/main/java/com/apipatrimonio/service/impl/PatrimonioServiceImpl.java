package com.apipatrimonio.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apipatrimonio.model.PatrimonioModel;
import com.apipatrimonio.repository.MarcaRepository;
import com.apipatrimonio.repository.PatrimonioRepository;
import com.apipatrimonio.service.PatrimonioService;

@Service
public class PatrimonioServiceImpl implements PatrimonioService {
	
	@Autowired
	PatrimonioRepository patrimonioRepository;

	@Autowired
	MarcaRepository marcaRepository;
	
	@Override
	public List<PatrimonioModel> findAll() {
		return patrimonioRepository.findAll();
	}

	@Override
	public PatrimonioModel save(PatrimonioModel patrimonio) {
		if(marcaRepository.findById(patrimonio.getMarca_id()).isPresent()) {
			patrimonioRepository.save(patrimonio);
			return patrimonio;
		}else
			return null;
		
	}

	@Override
	public Optional<PatrimonioModel> findById(long id) {
		return patrimonioRepository.findById(id);
	}

	@Override
	public void deleteById(long id) {
		patrimonioRepository.deleteById(id);
		
	}
}
