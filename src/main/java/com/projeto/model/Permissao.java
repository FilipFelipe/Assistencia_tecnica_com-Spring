package com.projeto.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_PERMISSAO")
public class Permissao implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	private Long permissao_id;
	private String permissao_nome;
	
	
	
	
	//------------ID-----------------
	//ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PERMISSAO_ID")
	public Long getPermissao_id() {
		return permissao_id;
	}
	public void setPermissao_id(Long permissao_id) {
		this.permissao_id = permissao_id;
	}
	
	@Column(name = "PERMISSAO_NOME")
	public String getPermissao_nome() {
		return permissao_nome;
	}
	public void setPermissao_nome(String permissao_nome) {
		this.permissao_nome = permissao_nome;
	}
	
	
	
	

	
	
}
