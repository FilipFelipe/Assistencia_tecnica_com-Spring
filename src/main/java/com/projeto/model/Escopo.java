package com.projeto.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_PEÇAS")
public class Escopo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	private Long escopo_id;
	private String escopo_nome;

	//------------ID-----------------
	//ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ESCOPO_ID")
	public Long getEscopo_id() {
		return escopo_id;
	}
	public void setEscopo_id(Long escopo_id) {
		this.escopo_id = escopo_id;
	}

	
	//-----------NOME------------------
	//Nome
	//@NotNull
	//@NotBlank
	@Column(name = "ESCOPO_NOME")
	public String getEscopo_nome() {
		return escopo_nome;
	}

	public void setEscopo_nome(String escopo_nome) {
		this.escopo_nome = escopo_nome;
	}

	
	
	
	
}
