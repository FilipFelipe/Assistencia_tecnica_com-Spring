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
@Table(name = "TAB_FUNCIONARIO")
public class Funcionario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private String sexo;
	private String confirmeSenha;
	private String cpf;
	private String aniversario;
	private String telefone;
	private String bairro;
	private String rua;
	private String uf;
	private String complemento;
	private String cidade;
	private String cep;
	private String numero;
	
	
	//------------ID-----------------
	//ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FUNCIONARIO_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	//------------CONFIRME SENHA-----------------
	//ConfirmeSenha
	@Transient
	public String getConfirmeSenha() {
		return confirmeSenha;
	}
	public void setConfirmeSenha(String confirmeSenha) {
		this.confirmeSenha = confirmeSenha;
	}

	//-----------NOME------------------
	//Nome
	@Column(name = "NOME")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//-------------SENHA----------------
	//Senha 
	@Column(name = "SENHA")
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
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
	
	//------------SEXO-----------------
	//sexo
	@Column(name = "SEXO")
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//----------CPF---------------
	//cpf
	@Column(name = "CPF")
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//-------------NIVER----------------
	//aniversario
	@Column(name = "DATA_DE_NASCIMENTO")
	public String getAniversario() {
		return aniversario;
	}
	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
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
