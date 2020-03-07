package com.projeto.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "TAB_FORNECEDOR")
public class Fornecedor implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	private Long id;
	private String nome_fantasia;
	private String email;
	private String cnpj;
	private String contato;
	private String telefone;
	private String bairro;
	private String rua;
	private String uf;
	private String complemento;
	private String cidade;
	private String cep;
	private String razao_social;
	private String pais;
	private String numero;
	
	
	
	
	//------------ID-----------------
	//ID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FORNECEDOR_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

	//----------E-MAIL-------------------
	//E-mail
	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//-----------TELEFONE------------------
	//telefone
	@Column(name = "TELEFONE")
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	//-----------COMPLEMENTO------------------
		//complemento
	@Column(name = "COMPLEMENTO")
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	//-----------CIDADE------------------
	//CIDADE
	@Column(name = "CIDADE")
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	//-----------CEP------------------
	//CEP
	@Column(name = "CEP")
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	//-----------NUMERO------------------
	//NUMERO
	@Column(name = "NUMERO")
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	//-----------UF------------------
	//uf
	@Column(name = "UF")
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	//-----------RUA------------------
	//RUA
	@Column(name = "RUA")
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	
	//-----------BAIRRO------------------
	//BAIRRO
	@Column(name = "BAIRRO")
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
}
