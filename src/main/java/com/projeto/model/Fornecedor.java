package com.projeto.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private String contrato;
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
	private String isAtivo;
	
	
	
	
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
	
	
	//-----------NOME_FANTASIA------------------
	//Nome_FANTASIA
	@Column(name = "NOME_FANTASIA")
	public String getNome_fantasia() {
		return nome_fantasia;
	}
	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}
	
	//-----------CNPJ------------------
	//CNPJ
	@Column(name = "CNPJ")
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	//-----------CONTRATO---------------
	//contrato
	@Column(name = "CONTRATO")
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	
	//-----------RAZAO_SOCIAL------------------
	//RAZAO
	@Column(name = "RAZAO_SOCIAL")
	public String getRazao_social() {
		return razao_social;
	}
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	
	//-----------PAIS------------------
	//PAIS
	@Column(name = "PAIS")
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	//-----------ATIVO------------------
	//ATIVO
	@Column(name = "ATIVO")
	public String getIsAtivo() {
		return isAtivo;
	}
	public void setIsAtivo(String isAtivo) {
		this.isAtivo = isAtivo;
	}
	
	
	
}
