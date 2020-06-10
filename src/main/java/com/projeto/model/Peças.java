package com.projeto.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TAB_PEÇAS")
public class Peças implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	private Long id;
	private String nome;
	private String valor;
	private String tipo;
	private String obs;
	private String fornecedor_id;
	
	
	
	//------------ID-----------------
	//ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USUARIO_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	//-----------NOME------------------
	//Nome
	@NotNull
	@NotBlank
	@Column(name = "NOME")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	//-----------VALOR------------------
	//VALOR
	@Column(name = "VALOR")
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	//-----------TIPO------------------
	//TIPO
	@Column(name = "TIPO")
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//-----------OBS------------------
	//OBS
	@Column(name = "OBS")
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	
	
	//-----------FORNECEDOR------------------
	//FORNECEDOR
	@Column(name = "FORNECEDOR_ID")
	public String getFornecedor_id() {
		return fornecedor_id;
	}
	public void setFornecedor_id(String fornecedor_id) {
		this.fornecedor_id = fornecedor_id;
	}
	
	

	

	
	

	
	
}
