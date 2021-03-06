package DAO.model;

import java.util.ArrayList;
import java.util.List;

public class Sede {
	protected int id;
	protected String nombre;
	protected float presupuesto;
	protected int ncomplejos;
	protected List<Complejo> complejos;
	
	//private Complejo[] miscomplejos;
	
	public Sede() {
		id=ncomplejos=-1;
		presupuesto=0;
		nombre="";
		complejos = new ArrayList<Complejo>();
	}
	public Sede(String nombre, float presupuesto, int ncomplejos) {
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.ncomplejos = ncomplejos;
		id=-1;
		complejos = new ArrayList<Complejo>();
	}
	public Sede(int id, String nombre, float presupuesto, int ncomplejos) {
		this.id = id;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.ncomplejos = ncomplejos;
		complejos = new ArrayList<Complejo>();
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
	public float getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
	}
	public int getNcomplejos() {
		return ncomplejos;
	}
	public void setNcomplejos(int ncomplejos) {
		this.ncomplejos = ncomplejos;
	}
	
	public List<Complejo> getComplejos() {
		return complejos;
	}
	public void setComplejos(List<Complejo> complejos) {
		this.complejos = complejos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sede other = (Sede) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Sede [id=" + id + ", nombre=" + nombre + ", presupuesto=" + presupuesto + ", ncomplejos=" + ncomplejos
				+ "]";
	}
}
