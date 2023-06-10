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
@Table(name="vuelo")
public class Vuelo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id_numvuelo;

	
	private String origen;
	private String destino;
	private String fecha;
	private String hora;
	
	//RELACIONES
	@ManyToOne
	@JoinColumn(name = "id_avion", referencedColumnName = "id_avion")
	private Aviones Id_avion;

	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="Id_numvuelo")
	private List<Tripu_Vuelo> tripVuelo;
	//
	
	//CONSTRUCTORES
	public Vuelo() {
		super();
	}
	
	public Vuelo(Long id_numvuelo, String origen, String destino, String fecha, String hora, Aviones id_avion) {
		super();
		Id_numvuelo = id_numvuelo;
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.hora = hora;
		Id_avion = id_avion;
	}
	//
	
	//GETTERS AND SETTERS
	public Long getId_numvuelo() {
		return Id_numvuelo;
	}


	public void setId_numvuelo(Long id_numvuelo) {
		Id_numvuelo = id_numvuelo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Aviones getId_avion() {
		return Id_avion;
	}

	public void setId_avion(Aviones id_avion) {
		Id_avion = id_avion;
	}

}
