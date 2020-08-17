package com.apipatrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apipatrimonio.model.PatrimonioModel;

@Repository
public interface PatrimonioRepository extends JpaRepository<PatrimonioModel, Long>{

}
