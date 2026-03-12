package santiago_ballesta_carmona.ejercicio1;

import java.util.Scanner;

import ejercicio_parcelas.Parcela;

public class Ejercicio1 {

	public static void main(String[] args) {
		String menu = """
				1.Añadir un dispositivo
				
				2.Borrar un dispositivo
				
				3.Actualizar información de un dispositivo
				
				4.Mostrar información de un dispositivo
				
				5.Listar todos los dispositivos
				
				6.Listar dispositivos por tipo
				
				0.Salir
				""";
		Scanner sc = new Scanner(System.in);
		Dispositivo[] dispositivos;
		dispositivos = new Dispositivo[30];
		int opcion = -1;
		
		do {
			
			System.out.println(menu);
			opcion = sc.nextInt();
			menu(opcion, dispositivos);
		} while (opcion != 0);
		
		
	}
	
	
	public static void menu(int opcion, Dispositivo[] dispositivos) {
		switch (opcion) {
		case 1:
			anadirDispositivo(dispositivos);
			break;
		case 2:
			if (eliminarDispositivo(dispositivos)){
				System.out.println("Dispositivo eliminado");
			} else {
				System.out.println("Error en la eliminación");
				}
			break;
		case 3:
			actualizarDispositivo(dispositivos);
			break;
		case 4:
			mostrarInfoDispositivo(dispositivos);
			break;
		case 5:
			mostrarTodosDispositivos(dispositivos);
			break;
		case 6:
			mostrarPorTipo(dispositivos);
			break;
		case 0:
		default:
			break;
		}
		
	}
	
	public static void anadirDispositivo(Dispositivo[] dispositivos) {
		 Scanner sc = new Scanner(System.in);
		    
		 System.out.println("Introduce el código único (6 caracteres):");
		 String id = sc.next();
		    
		 //comprobador de existentes.
		 for (int i=0; i<dispositivos.length; i++) {
			 if(dispositivos[i] != null && dispositivos[i].getCodigo().equals(id)) {
				 System.out.println("Error, el dispositivo con este código ya existe.");
				 return;
			 }
		 }
		 
		 System.out.println("Introduce el nombre (Máximo 50 caracteres)");
		 String nombre = sc.next();
		 
		 System.out.println("Introduce el tipo (smartphone, portatil o tablet)");
		 TipoDispositivo tipo = TipoDispositivo.valueOf((sc.next()).toUpperCase());
		 System.out.println("Introduce el precio");
		 double precio = sc.nextDouble();
		 
		 System.out.println("Introduce el sistema operativo (A / I / W)"); // revisar
		 String sistemaOperativoString = sc.next().toUpperCase();
		 
		 char sistemaOperativo = sistemaOperativoString.charAt(0); 
		 
		 for (int i = 0; i < dispositivos.length; i++) {
		        if (dispositivos[i] == null) {
		        	dispositivos[i] = new Dispositivo(id, nombre, tipo, precio, sistemaOperativo);
		            return;
		        }
		    }
		    System.out.println("Array lleno.");
	}
	
	public static boolean eliminarDispositivo(Dispositivo [] dispositivos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el dispositivo a eliminar");
		String id = sc.next();
		
		for (int i=0; i<dispositivos.length ; i++) {
			if (dispositivos[i] != null) {
				if (id.equalsIgnoreCase(dispositivos[i].getCodigo())) {
					dispositivos[i] = null;
					return true;
				}
			}
		} return false;
	}

	public static void actualizarDispositivo(Dispositivo[] dispositivos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el código (6 caracteres) del dispositivo a modificar");
		String id = sc.next();
		
		for (int i=0; i<dispositivos.length ; i++) {
			if (dispositivos[i] != null) {
				if (id.equalsIgnoreCase(dispositivos[i].getCodigo())) {
					
					 System.out.println("Introduce el nombre (Máximo 50 caracteres)");
					 String nombre = sc.next();
					 dispositivos[i].setNombre(nombre);
					 
					 System.out.println("Introduce el tipo (smartphone, portatil o tablet)");
					 TipoDispositivo tipo = TipoDispositivo.valueOf((sc.next()).toUpperCase());
					 dispositivos[i].setTipo(tipo);
					 
					 System.out.println("Introduce el precio");
					 double precio = sc.nextDouble();
					 dispositivos[i].setPrecio(precio);
					 
					 System.out.println("Introduce el sistema operativo (A / I / W)"); // revisar
					 String sistemaOperativoString = sc.next().toUpperCase();
					 char sistemaOperativo = sistemaOperativoString.charAt(0); 
					 dispositivos[i].setSistemaOperativo(sistemaOperativo);
					 break;
				}
			}
		}
	}
	
	public static void mostrarInfoDispositivo(Dispositivo[] dispositivos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el código (6 caracteres) del dispositivo cuya información quieres ver");
		String id = sc.next();
		
		for (int i=0; i<dispositivos.length ; i++) {
			if (dispositivos[i] != null) {
				if (id.equalsIgnoreCase(dispositivos[i].getCodigo())) {
					System.out.println(dispositivos[i].toString());
					return;
				}
			}
		}
	}
	
	public static void mostrarTodosDispositivos (Dispositivo[] dispositivos) {
		for (int i=0; i<dispositivos.length ; i++) {
			if (dispositivos[i] != null) {
					System.out.println(dispositivos[i].toString());
					System.out.println();
			}
		}
	}

	
	public static void mostrarPorTipo (Dispositivo[] dispositivos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tipo a listar (portatil, smartphone o tablet)");
		TipoDispositivo tipo = TipoDispositivo.valueOf((sc.next()).toUpperCase());
		
		for (int i=0; i<dispositivos.length ; i++) {
			if (dispositivos[i] != null) {
				if (tipo.equals(dispositivos[i].getTipo())) {
					System.out.println(dispositivos[i].toString());
				}
			}
		}
	}

} // fin class
	
	

