package com.apipatrimonio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "MARCA")
public class MarcaModel implements Serializable{
	private static final long serialVersionUID = 1L;
	@NonNull
	@Column(unique = true)
	private  String nome;
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int marca_id;

}
