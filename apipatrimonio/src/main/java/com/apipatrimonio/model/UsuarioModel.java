package com.apipatrimonio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "USUARIO")
public class UsuarioModel implements Serializable{
	private static final long serialVersionUID = 1L;
	@NonNull
	@Column
	private  String nome;
	@NonNull
	@Column(unique = true)
	private  String email;
	@NonNull
	@Column
	private  String senha;

}
