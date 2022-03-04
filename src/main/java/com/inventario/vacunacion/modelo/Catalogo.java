package com.inventario.vacunacion.modelo;

import java.io.Serializable;
import javax.persistence.*;



/**
 * The persistent class for the catalogo database table.
 * 
 */
@Entity
@NamedQuery(name="Catalogo.findAll", query="SELECT c FROM Catalogo c")
public class Catalogo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String codigo;

	private String descripcion;

	//bi-directional many-to-one association to Empleado
	//@OneToMany(mappedBy="estadoVacuna")
	//private List<Empleado> empleados;

	public Catalogo() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

//	public List<Empleado> getEmpleados() {
//		return this.empleados;
//	}
//
//	public void setEmpleados(List<Empleado> empleados) {
//		this.empleados = empleados;
//	}

//	public Empleado addEmpleado(Empleado empleado) {
//		getEmpleados().add(empleado);
//		empleado.setCatalogo(this);
//
//		return empleado;
//	}
//
//	public Empleado removeEmpleado(Empleado empleado) {
//		getEmpleados().remove(empleado);
//		empleado.setCatalogo(null);
//
//		return empleado;
//	}

}