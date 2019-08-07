package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class administrador implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 7478053297730636687L;
	@Id //Clave primaria
	@Column(length=11, nullable=false)
	private int idAdministrador;
	@Column(length=20, nullable=false)
	private String usuario;
	@Column(length=20, nullable=false)
	private String contrasena;
	//Constructor
	
	public administrador(int idAdministrador, String usuario, String contraseña) {
		super();
		this.idAdministrador = idAdministrador;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	//Constructor default
	public administrador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//SET y GET
	public int getIdAdministrador() {
		return idAdministrador;
	}
	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contrasena;
	}
	public void setContraseña(String contrasena) {
		this.contrasena = contrasena;
	}
	

	
}
