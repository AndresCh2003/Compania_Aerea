package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "base")
public class Base implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_base;
	private String nombre_base;
	// RELACIONES
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "Id_base")
	private List<Aviones> aviones;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "Id_base")
	private List<Tripulacion> tripulacion;

	//

	// CONSTRUCTORES
	public Base() {
		super();
	}

	public Base(Long id_base, String nombre_base) {
		super();
		Id_base = id_base;
		this.nombre_base = nombre_base;
	}
	//

	// GETERS AND SETTERS

	public Long getId_base() {
		return Id_base;
	}

	public void setId_base(Long id_base) {
		Id_base = id_base;
	}

	public String getNombre_base() {
		return nombre_base;
	}

	public void setNombre_base(String nombre_base) {
		this.nombre_base = nombre_base;
	}

}
