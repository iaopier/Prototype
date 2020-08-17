package com.apipatrimonio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apipatrimonio.model.PatrimonioModel;
import com.apipatrimonio.repository.PatrimonioRepository;
import com.apipatrimonio.service.PatrimonioService;

@Service
public class PatrimonioServiceImpl implements PatrimonioService {
	
	@Autowired
	PatrimonioRepository patrimonioRepository;

	@Override
	public List<PatrimonioModel> findAll() {
		return patrimonioRepository.findAll();
	}
}
