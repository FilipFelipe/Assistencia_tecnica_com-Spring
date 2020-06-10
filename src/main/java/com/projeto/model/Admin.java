package com.projeto.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "TAB_ADMIN")
public class Admin implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADMIN_ID")
	private Long id;
	
	@NotNull
	@NotBlank
	@Column(name = "NOME")
	private String nome;
	
	@NotNull
	@NotBlank
	@Column(name = "EMAIL")
	private String email;
	
	@NotNull
	@NotBlank
	@Column(name = "SENHA")
	private String senha;
	
	@Transient
	private String confirmeSenha;
	
	@Column(name = "DATA")
	private String data;
	
	
	
	

	

	
	

	
	
}
