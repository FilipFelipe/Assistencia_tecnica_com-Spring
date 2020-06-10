package com.projeto.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "TAB_USUARIO")
//@ValidarSenha(confirmeSenha = "confirmeSenha",senha = "senha", message = "EM BRANCO")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USUARIO_ID")
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
	@Column(name = "SEXO")
	private String sexo;
	@Column(name = "CONFIRMESENHA")
	private String confirmeSenha;
	@Column(name = "CPF")
	private String cpf;
	@Column(name = "ANIVERSARIO")
	private String aniversario;
	@Column(name = "TELEFONE")
	private String telefone;
	@Column(name = "BAIRRO")
	private String bairro;
	@Column(name = "RUA")
	private String rua;
	@Column(name = "UF")
	private String uf;
	@Column(name = "COMPLEMENTO")
	private String complemento;
	@Column(name = "CIDADE")
	private String cidade;
	@Column(name = "CEP")
	private String cep;
	@Column(name = "NUMERO")
	private String numero;
	@Column(name = "ATIVO")
	private Boolean isAtivo;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "TAB_USUARIO_ROLE",
	joinColumns = @JoinColumn(name = "USUARIO_ID"), inverseJoinColumns = @JoinColumn(name= "ROLE_ID"))
	private List<Role>roles;

	
	

	
	
}
