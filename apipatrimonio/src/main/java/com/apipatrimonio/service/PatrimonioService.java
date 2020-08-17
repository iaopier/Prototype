package com.apipatrimonio.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.apipatrimonio.model.MarcaModel;
import com.apipatrimonio.model.PatrimonioModel;

public interface PatrimonioService {

	List<PatrimonioModel> findAll();

	PatrimonioModel save(PatrimonioModel patrimonio);

	Optional<PatrimonioModel> findById(long id);

	void deleteById(long id);


}
