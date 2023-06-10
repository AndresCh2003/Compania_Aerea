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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "aviones")
public class Aviones implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long Id_avion;

	private String codigo;
	private String tipo;

	// RELACIONES
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "Id_avion")
	private List<Vuelo> vuelo;

	@ManyToOne
	@JoinColumn(name = "id_base", referencedColumnName = "id_base")
	private Base Id_base;

	//
	// CONSTRUCTORES

	public Aviones() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Aviones(Long id_avion, String codigo, String tipo, Base id_base) {
		super();
		Id_avion = id_avion;
		this.codigo = codigo;
		this.tipo = tipo;
		Id_base = id_base;
	}


	//


	//GETTERS AND SETTERS
	public Long getId_avion() {
		return Id_avion;
	}

	public void setId_avion(Long id_avion) {
		Id_avion = id_avion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Base getId_base() {
		return Id_base;
	}


	public void setId_base(Base id_base) {
		Id_base = id_base;
	}

	
}
