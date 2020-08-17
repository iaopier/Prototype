package com.apipatrimonio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NonNull
	@Column
	@NotEmpty(message = "Nome não pode ser vazio")
	private  String nome;
	@NonNull
	@Column(unique = true)
	@NotEmpty(message = "Email não pode ser vazio")
	@Email(message = "O email deve ser um email válido")
	private  String email;
	@NonNull
	@Column
	@NotEmpty(message = "Senha não pode ser vazia")
	private  String senha;

	
}
