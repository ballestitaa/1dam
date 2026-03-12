package ejercicio_profesores;
import java.util.*;

public class Principal {
	

	public static void main(String[] args) {
		
		Alumno[] alumnos = new Alumno[50];
        Profesor[] profesores = new Profesor[50];
        Asignatura[] asignaturas = new Asignatura[50];
        int eleccion;
        
        
        
        menuPrincipal();        
        
        
		
	}

	public static void menuProfesores() {
		String menuProfesores = """
        		
				Menú profesores:
				
				1. Mostrar profesores
				
				2. Añadir profesores
				
				3. Mostrar asignaturas que imparte el profesor
				
				4. Mostrar asignaturas del año que imparte el profesor
				
				5. Asignar docencia al profesor
				
				0. Volver al menú principal""";
		
			int eleccion = 0;
			System.out.print(menuProfesores);
			Scanner sc = new Scanner(System.in);
			eleccion = sc.nextInt();
			if (eleccion==1) {Profesor.visualizar();} 
			else if (eleccion==2) {menuAsignatura();}
			else if (eleccion==3) {menuProfesores();}
			else if (eleccion==0) {return;}
	}
	
			

	public static void menuAsignatura() {
		String menuAsignatura = """ 
				Menú asignatura:
				
				1. Mostrar asignaturas
				
				2. Añadir asignaturas
				
				0. Salir""";
	}

	public static void menuAlumnos() {
		String menuAlumnos = """ 
    			1. Mostrar alumnos

				2. Añadir alumnos
				
				3. Mostrar asignaturas del alumno
				
				4. Mostrar asignaturas del alumno para el año
				
				5. Matricular alumno a la asignatura
				
				0. Volver al menú principal""";
	}

	public static void menuPrincipal() {
		
		String menuPrincipal = """ 
			Introduzca la opción que desea realizar:
			
			1. Menú alumnos
			
			2. Menú asignaturas
			
			3. Menú profesores
			
			0. Salir""";
		
		int eleccion = 0;
		System.out.print(menuPrincipal);
		Scanner sc = new Scanner(System.in);
		eleccion = sc.nextInt();
		if (eleccion==1) {menuAlumnos();} 
		else if (eleccion==2) {menuAsignatura();}
		else if (eleccion==3) {menuProfesores();}
		else if (eleccion==0) {return;}
		
	}

}
