package ejercicio_profesores;

public class Persona {

	protected String nombre;
	protected String apellido;
	protected String dni;
	protected String email;
	protected Asignatura [] asignaturas;
	
	
	
	public Persona(String nombre, String apellido, String dni, String email, Asignatura [] asignaturas) {
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
		setEmail(email);
		setAsignaturas(asignaturas);
	}
	
	public Persona() {
		setNombre("null");
		setApellido("null");
		setDni("null");
		setEmail("null");
		setAsignaturas(null);
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	
	
	public void visualizar() {
		System.out.println("Persona: " + nombre + " " + apellido + " | DNI: " + dni + " | Email: " + email);
	}
	
	public void visualizarAsig() {
		for(int i = 0; i<asignaturas.length; i++) {
			System.out.print(asignaturas[i].toString());
			System.out.print(" ");
		}
	}
	
	public void visualizarAsig(int numero) {
		if (numero<asignaturas.length-1) {
			System.out.println(asignaturas[numero]);
		} else System.out.println("error, esa asignatura no existe.");
		
	}
	
	
}
