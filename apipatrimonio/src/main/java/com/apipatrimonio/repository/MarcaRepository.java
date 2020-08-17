package com.apipatrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apipatrimonio.model.MarcaModel;

@Repository
public interface MarcaRepository extends JpaRepository<MarcaModel, Long>{

}
