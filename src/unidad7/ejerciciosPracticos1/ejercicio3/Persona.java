package unidad7.ejerciciosPracticos1.ejercicio3;

import java.util.Scanner;
public class Persona {

	private String nombre;
	private String dni;
	
	Persona(String nombre, String dni){
		
		setNombre(nombre);
		setDni(dni);
		
		
	}
	
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String toString() {
		
		return "NOMBRE: "+ this.nombre + ", DNI: "+this.dni;
		
	}
	
	public static Persona pasoFrontera() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Introduce nombre:");
	    String nombre = sc.nextLine();
	    System.out.println("Introduce DNI:");
	    String dni = sc.next();
	    return new Persona(nombre, dni);
	}
	
	public static void mostrar(Persona [] personas) {
		
		for(int i=0; i<personas.length; i++) {
			System.out.println(personas[i].toString());
		}
		
	}
	
	public static void buscarNombre(Persona [] personas, String nombreBuscar) {
		for(int i=0; i<personas.length; i++) {
			if(personas[i] != null && personas[i].getNombre().equals(nombreBuscar)) {
				System.out.println("Nombre encontrado en el hueco "+i+" del array.");
				return;
			} 
		}
		System.out.println("No encontrado");
	}
	
	public static void buscarDni(Persona [] personas, String dniBuscar) {
		for(int i=0; i<personas.length; i++) {
			if(personas[i] != null && personas[i].getDni().equals(dniBuscar)) {
				System.out.println("DNI encontrado en el hueco "+i+" del array.");
				return;
			} 
		}
		System.out.println("No encontrado");
	}
	
	
	
}
