package com.apipatrimonio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "PATRIMONIO")
public class PatrimonioModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NonNull
	@Column
	private  String nome;
	@Column
	private int marca_id;
	@Column
	private String descricao;
	@Column(updatable=false)
	@GeneratedValue
	private long numero_tombo;
	
	
}
