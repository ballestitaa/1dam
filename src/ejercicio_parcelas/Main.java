package ejercicio_parcelas;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Parcela [] parcelas = new Parcela[20];
		int opcion;
		Scanner sc = new Scanner(System.in);
		String menu = """
				Introduzca la opción que desea realizar:
				
				1. Crear una parcela
				
				2. Eliminar una parcela
				
				3. Actualizar datos de una parcela
				
				4. Mostrar datos de una parcela
				
				5. Mostrar datos de todas las parcelas
				
				6. Mostrar parcelas de un propietario dado su DNI.
				
				0. Salir
				""";
	
		do {
			System.out.println(menu);
			opcion = sc.nextInt();
			menu(opcion, parcelas);
		} while (opcion != 0);
		
		
		
	
	
	}


	private static void menu(int opcion, Parcela[] parcelas) {
		
		switch (opcion) {
		case 1:
			crearParcela(parcelas);
			break;
		case 2:
			eliminarParcela(parcelas);
			break;
		case 3:
			actualizarParcela(parcelas);
			break;
		case 4:
			mostrarUnaParcela(parcelas);
			break;
		case 5:
			datosTodasParcelas(parcelas);
			break;
		case 6:
			parcelasPorDni(parcelas);
			break;
		case 0:
		default:
			break;
		}
	}
	
	
	public static void crearParcela(Parcela[] parcelas) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Introduce el identificador único:");
	    String id = sc.next();

	    // Comprobar duplicados
	    for (int i = 0; i < parcelas.length; i++) {
	        if (parcelas[i] != null && parcelas[i].getIdentificador().equalsIgnoreCase(id)) {
	            System.out.println("ERROR: ID ya existe.");
	            return;
	        }
	    }

	    System.out.println("Introduce el área en hectáreas:");
	    int area = sc.nextInt();
	    System.out.println("Introduce el DNI:");
	    String dni = sc.next();
	    System.out.println("Introduce la letra (A, B, C):");
	    String letra = sc.next();

	    // Buscar hueco y guardar
	    for (int i = 0; i < parcelas.length; i++) {
	        if (parcelas[i] == null) {
	            parcelas[i] = new Parcela(id, area, dni, letra);
	            System.out.println("Guardado.");
	            return;
	        }
	    }
	    System.out.println("Array lleno.");
	}
	
	public static boolean eliminarParcela(Parcela [] parcelas) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la parcela a eliminar");
		String id = sc.next();
		
		for (int i=0; i<parcelas.length ; i++) {
			if (parcelas[i] != null) {
				if (id.equalsIgnoreCase(parcelas[i].getIdentificador())) {
					parcelas[i] = null;
					return true;
				}
			}
		} return false;
	}
	
	public static void actualizarParcela(Parcela [] parcelas) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la parcela a editar");
		String id = sc.next();
		int area;
		String dni;
		String letra;
		
		for (int i=0; i<parcelas.length ; i++) {
			if (parcelas[i] != null) {
				if (id.equalsIgnoreCase(parcelas[i].getIdentificador())) {
					
					System.out.println("Introduzca el área en hectáreas");
					area = sc.nextInt();
					parcelas[i].setArea(area);
					System.out.println("Introduzca el dni");
					dni = sc.next();
					parcelas[i].setDni(dni);
					System.out.println("Introduzca la letra del tipo de parcela");
					letra = sc.next();
					parcelas[i].tipoParcelaLetra(letra);
					break;
				}
			}
		}
	}
	
	public static void datosTodasParcelas(Parcela [] parcelas) {
		for (int i=0; i<parcelas.length ; i++) {
			if (parcelas[i] != null) {
				System.out.println("Parcela número "+i);
				parcelas[i].mostrarDatos();
			}
		}
		
	}
	
	public static void parcelasPorDni(Parcela [] parcelas) {
		String dni;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su DNI");
		dni = sc.next();
		
		
		for (int i=0; i<parcelas.length ; i++) {
			if (parcelas[i] != null && parcelas[i].getDni().equals(dni)) {
				System.out.println("Parcela número "+i);
				parcelas[i].mostrarDatos();
			}
		}
	}
	
	public static void mostrarUnaParcela(Parcela[] parcelas) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Introduzca el identificador de la parcela a consultar:");
	    String id = sc.next();

	    for (int i = 0; i < parcelas.length; i++) {
	        if (parcelas[i] != null && parcelas[i].getIdentificador().equalsIgnoreCase(id)) {
	            parcelas[i].mostrarDatos();
	            return; 
	        }
	    }
	        System.out.println("No se ha encontrado ninguna parcela con ese ID.");
	    }
	}
	




