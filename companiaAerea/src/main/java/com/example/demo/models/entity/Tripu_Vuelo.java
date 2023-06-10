package com.example.demo.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tripu_vuelo")
public class Tripu_Vuelo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_secuencial;

	// RELACIONES
	@ManyToOne
	@JoinColumn(name = "Id_numvuelo", referencedColumnName = "Id_numvuelo")
	private Vuelo Id_numvuelo;

	@ManyToOne
	@JoinColumn(name = "id_tripulacion", referencedColumnName = "id_tripulacion")
	private Tripulacion Id_tripulacion;
	//

	// CONSTRUCTORES
	public Tripu_Vuelo() {
		super();
	}

	
	public Tripu_Vuelo(Long id_secuencial, Vuelo id_numvuelo, Tripulacion id_tripulacion) {
		super();
		Id_secuencial = id_secuencial;
		Id_numvuelo = id_numvuelo;
		Id_tripulacion = id_tripulacion;
	}


	//

	// GETTERS AND SETTERS
	public Long getId_secuencial() {
		return Id_secuencial;
	}

	public void setId_secuencial(Long id_secuencial) {
		Id_secuencial = id_secuencial;
	}

	

	public Vuelo getId_numvuelo() {
		return Id_numvuelo;
	}


	public void setId_numvuelo(Vuelo id_numvuelo) {
		Id_numvuelo = id_numvuelo;
	}


	public Tripulacion getId_tripulacion() {
		return Id_tripulacion;
	}

	public void setId_tripulacion(Tripulacion id_tripulacion) {
		Id_tripulacion = id_tripulacion;
	}

}
