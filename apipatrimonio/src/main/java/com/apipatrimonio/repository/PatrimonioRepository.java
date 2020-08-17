package com.apipatrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apipatrimonio.model.PatrimonioModel;

public interface PatrimonioRepository extends JpaRepository<PatrimonioModel, Long>{

}
