package unidad9.actividadGrupal;

import java.util.Objects;

public class Investigador {
	private int invID;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private Departamento dpto;
	
	
	public int getInvID() {
		return invID;
	}
	public void setInvID(int invID) {
		this.invID = invID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	
	public Departamento getDpto() {
		return dpto;
	}
	public void setDpto(Departamento dpto) {
		this.dpto = dpto;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	@Override
	public String toString() {
		return "Investigador [invID=" + invID + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", correo=" + correo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellido, correo, invID, nombre, telefono);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Investigador other = (Investigador) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(correo, other.correo) && invID == other.invID
				&& Objects.equals(nombre, other.nombre) && Objects.equals(telefono, other.telefono);
	}
	
	
	
	
	public Investigador(int invID, String nombre, String apellido, String telefono, String correo, Departamento dpto) {
		super();
		this.invID = invID;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.dpto = dpto;
	}

	
	
	
}
