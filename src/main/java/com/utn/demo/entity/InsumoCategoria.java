package com.utn.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Where;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Where(clause = "eliminado=false")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsumoCategoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "articulocategoria_id")
	private int id;
	private String nombre;
	private String descripcion;
	@Column(name = "eliminado")
	private boolean eliminado;
	private boolean es_insumo;
	public InsumoCategoria() {
		super();
	}
	public InsumoCategoria(int id, String nombre, String descripcion, boolean eliminado, boolean es_insumo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.eliminado = eliminado;
		this.es_insumo = es_insumo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	public boolean isEs_insumo() {
		return es_insumo;
	}
	public void setEs_insumo(boolean es_insumo) {
		this.es_insumo = es_insumo;
	}
	
}
