package com.projeto.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_ROLE_PERMISSAO")
public class Role_Permissao implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	private Long id;
	private Long role_id;
	private Long permissao_id;
	private Long escopo_id;
	
	
	
	
	//------------ID-----------------
	//ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ROLE_PERMISSAO_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "ROLE_ID")
	public Long getRole_id() {
		return role_id;
	}
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}
	
	@Column(name = "PERMISSAO_ID")
	public Long getPermissao_id() {
		return permissao_id;
	}
	public void setPermissao_id(Long permissao_id) {
		this.permissao_id = permissao_id;
	}
	
	@Column(name = "ESCOPO_ID")
	public Long getEscopo_id() {
		return escopo_id;
	}
	public void setEscopo_id(Long escopo_id) {
		this.escopo_id = escopo_id;
	}

	
}
