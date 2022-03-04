package com.inventario.vacunacion.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vacuna database table.
 * 
 */
@Entity
@NamedQuery(name="Vacuna.findAll", query="SELECT v FROM Vacuna v")
public class Vacuna implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_vacunacion")
	private Date fechaVacunacion;

	@Column(name="numero_dosis")
	private Integer numeroDosis;

	private String tipo;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="id_empleado")
	private Empleado empleado;

	public Vacuna() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaVacunacion() {
		return this.fechaVacunacion;
	}

	public void setFechaVacunacion(Date fechaVacunacion) {
		this.fechaVacunacion = fechaVacunacion;
	}

	public Integer getNumeroDosis() {
		return this.numeroDosis;
	}

	public void setNumeroDosis(Integer numeroDosis) {
		this.numeroDosis = numeroDosis;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}