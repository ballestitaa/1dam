package ejercicio_profesores;

public class Profesor extends Persona{

	// lo demás es super
	private String direccion;
	
	public Profesor(String nombre, String apellido, String dni, String email, Asignatura [] asignaturas) {
		super(nombre, apellido, dni, email, asignaturas);
	}
	
	public Profesor() {
		super();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Asignatura[] getImparte() {
		return asignaturas;
	}
	
	public void setImparte(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	public static void test(){
		System.out.println("fdahfasd");
	}
}
