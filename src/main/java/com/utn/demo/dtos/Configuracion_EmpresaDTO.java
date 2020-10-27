package com.utn.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Configuracion_EmpresaDTO {
	private int id;
	private int cuit;
	private int numeroFiscal;
	private int telefono;
	private int cantidadCocineros;
	private String nombre;
	private String email;
	private String sociedad;
	private boolean eliminado;
	public Configuracion_EmpresaDTO() {
		super();
	}
	public Configuracion_EmpresaDTO(int id, int cuit, int numeroFiscal, int telefono, int cantidadCocineros,
			String nombre, String email, String sociedad, boolean eliminado) {
		super();
		this.id = id;
		this.cuit = cuit;
		this.numeroFiscal = numeroFiscal;
		this.telefono = telefono;
		this.cantidadCocineros = cantidadCocineros;
		this.nombre = nombre;
		this.email = email;
		this.sociedad = sociedad;
		this.eliminado = eliminado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public int getNumeroFiscal() {
		return numeroFiscal;
	}
	public void setNumeroFiscal(int numeroFiscal) {
		this.numeroFiscal = numeroFiscal;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getCantidadCocineros() {
		return cantidadCocineros;
	}
	public void setCantidadCocineros(int cantidadCocineros) {
		this.cantidadCocineros = cantidadCocineros;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSociedad() {
		return sociedad;
	}
	public void setSociedad(String sociedad) {
		this.sociedad = sociedad;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
}
