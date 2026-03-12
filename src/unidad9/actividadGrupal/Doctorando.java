package unidad9.actividadGrupal;

import java.sql.Date;
import java.util.Objects;

public class Doctorando extends Investigador{
	private Date fechaInicioDoctorado;

	
	public Doctorando(Date fechaInicioDoctorado, int invID, String nombre, String apellido, String telefono, String correo, Departamento dpto) {
		super(invID, nombre, apellido, telefono, correo, dpto);
		setFechaInicioDoctorado(fechaInicioDoctorado);
	}


	public Date getFechaInicioDoctorado() {
		return fechaInicioDoctorado;
	}

	public void setFechaInicioDoctorado(Date fechaInicioDoctorado) {
		this.fechaInicioDoctorado = fechaInicioDoctorado;
	}

	@Override
	public String toString() {
		return "Doctorando [fechaInicioDoctorado=" + fechaInicioDoctorado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaInicioDoctorado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctorando other = (Doctorando) obj;
		return Objects.equals(fechaInicioDoctorado, other.fechaInicioDoctorado);
	}

	
	
}
