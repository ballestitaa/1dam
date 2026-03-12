package ejercicio_profesores;

public class Alumno extends Persona{
	public Alumno(String nombre, String apellido, String dni, String email, Asignatura [] asignaturas) {
		super(nombre, apellido, dni, email, asignaturas);
	}
	
	public Alumno() {
		super();
	}
	
	public Asignatura[] getMatriculado() {
		return asignaturas;
	}
	
	public void setMatriculado(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	

	
}
