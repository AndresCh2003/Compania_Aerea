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
@Table(name="tripulacion")
public class Tripulacion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id_tripulacion;

	
	private String codigo;
	private String nombre_piloto;
	private String apellido_piloto;
	private String horas_vuelo;
	private String piloto_si_no;

	
	//RELACIONES
	@ManyToOne
	@JoinColumn(name = "id_base", referencedColumnName = "id_base")
	private Base Id_base;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="Id_tripulacion")
	private List<Tripu_Vuelo> tripVuelo;
	//
	
	//CONSTRUCTORES
	public Tripulacion() {
		super();
	}
	
	
	
	public Tripulacion(Long id_tripulacion, String codigo, String nombre_piloto, String apellido_piloto,
			String horas_vuelo, String piloto_si_no, Base id_base) {
		super();
		Id_tripulacion = id_tripulacion;
		this.codigo = codigo;
		this.nombre_piloto = nombre_piloto;
		this.apellido_piloto = apellido_piloto;
		this.horas_vuelo = horas_vuelo;
		this.piloto_si_no = piloto_si_no;
		Id_base = id_base;
	}



	//
	
	//GETTERS AND SETTERS
	public Long getId_tripulacion() {
		return Id_tripulacion;
	}

	public void setId_tripulacion(Long id_tripulacion) {
		Id_tripulacion = id_tripulacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre_piloto() {
		return nombre_piloto;
	}

	public void setNombre_piloto(String nombre_piloto) {
		this.nombre_piloto = nombre_piloto;
	}

	public String getApellido_piloto() {
		return apellido_piloto;
	}

	public void setApellido_piloto(String apellido_piloto) {
		this.apellido_piloto = apellido_piloto;
	}

	public String getHoras_vuelo() {
		return horas_vuelo;
	}

	public void setHoras_vuelo(String horas_vuelo) {
		this.horas_vuelo = horas_vuelo;
	}

	public String getPiloto_si_no() {
		return piloto_si_no;
	}

	public void setPiloto_si_no(String piloto_si_no) {
		this.piloto_si_no = piloto_si_no;
	}



	public Base getId_base() {
		return Id_base;
	}



	public void setId_base(Base id_base) {
		Id_base = id_base;
	}


}
