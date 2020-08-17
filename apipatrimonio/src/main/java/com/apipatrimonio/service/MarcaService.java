package com.apipatrimonio.service;

import java.util.List;
import java.util.Optional;

import com.apipatrimonio.model.MarcaModel;

public interface MarcaService {

	List<MarcaModel> findAll();

	MarcaModel save(MarcaModel marca);

	Optional<MarcaModel> findById(long id);
}
