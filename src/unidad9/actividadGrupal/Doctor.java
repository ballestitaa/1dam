package unidad9.actividadGrupal;

import java.sql.Date;
import java.util.Objects;

public class Doctor extends Investigador{
	
	private Date anyoTesis;
	private String tituloTesis;
	private String calificacionTesis;
	
	public Doctor(Date anyoTesis, String tituloTesis, String calificacionTesis,int invID, String nombre, String apellido, String telefono, String correo, Departamento dpto) {
		super(invID, nombre, apellido, telefono, correo, dpto);
		setAnyoTesis(anyoTesis);
		setTituloTesis(tituloTesis);
		setCalificacionTesis(calificacionTesis);
	}
	
	public Date getAnyoTesis() {
		return anyoTesis;
	}
	public void setAnyoTesis(Date anyoTesis) {
		this.anyoTesis = anyoTesis;
	}
	public String getTituloTesis() {
		return tituloTesis;
	}
	public void setTituloTesis(String tituloTesis) {
		this.tituloTesis = tituloTesis;
	}
	public String getCalificacionTesis() {
		return calificacionTesis;
	}
	public void setCalificacionTesis(String calificacionTesis) {
		this.calificacionTesis = calificacionTesis;
	}
	
	@Override
	public String toString() {
		return "Doctor [anyoTesis=" + anyoTesis + ", tituloTesis=" + tituloTesis + ", calificacionTesis="
				+ calificacionTesis + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(anyoTesis, calificacionTesis, tituloTesis);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		return Objects.equals(anyoTesis, other.anyoTesis) && Objects.equals(calificacionTesis, other.calificacionTesis)
				&& Objects.equals(tituloTesis, other.tituloTesis);
	}

	
}
