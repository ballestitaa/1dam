package unidad7.ejerciciosPracticos1.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Persona personas[] = new Persona[10];
	    int contador = 0; 
	    int opcion;

	    do {
	        System.out.println("1.Entrar | 2.Ver | 3.Busca Nombre | 4.Busca DNI | 5.Salir");
	        opcion = sc.nextInt();

	        switch (opcion) {
	            case 1: 
	                if (contador < personas.length) {
	                    personas[contador] = Persona.pasoFrontera();
	                    contador++;
	                }
	                break;
	            case 2:
	                for (int i = 0; i < contador; i++) {
	                    System.out.println(personas[i].toString());
	                }
	                break;
	            case 3:
	                System.out.print("Nombre a buscar: ");
	                Persona.buscarNombre(personas, sc.next());
	                break;
	            case 4: 
	                System.out.print("DNI a buscar: ");
	                Persona.buscarDni(personas, sc.next());
	                break;
	        }
	    } while (opcion != 5);
	}
}
