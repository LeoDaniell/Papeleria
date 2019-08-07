package com.utng.integradora.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class cliente implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 5274760680027089402L;
	@Id //Clave primaria
	@Column(length=11, nullable=false)
	private int idCliente;
	@Column(length=20, nullable=false)
	private String nombreCliente;
	@Column(length=20, nullable=false)
	private String correo;
	@Column(length=20, nullable=false)
	private String usuario;
	@Column(length=20, nullable=false)
	private String contrasena;
	
	//Constructor
	public cliente(int idCliente, String nombreCliente, String correo, String usuario, String contrasena) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.correo = correo;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	//SET Y GET
	public cliente() {
		super();
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
	
}

