package unidad2.actividadaplicacion;
import java.util.Scanner;

public class ActividadAplicacion214 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero;
		int decena;
		int unidad;
		String decenaTexto = "";
		String unidadTexto = "";
		String resultado = "";
		
		resultado = "vacio";
		
		
		System.out.println("Introduce el número entre 1 y 99 para pasarlo a texto:");
		numero = sc.nextInt();
		
		sc.close();
		
		decena = numero / 10;
		unidad = numero % 10;
		
		switch (numero) {
        	case 1: resultado = "uno"; break;
        	case 2: resultado = "dos"; break;
        	case 3: resultado = "tres"; break;
        	case 4: resultado = "cuatro"; break;
        	case 5: resultado = "cinco"; break;
        	case 6: resultado = "seis"; break;
        	case 7: resultado = "siete"; break;
        	case 8: resultado = "ocho"; break;
        	case 9: resultado = "nueve"; break;
        	case 10: resultado = "diez"; break;
        	case 11: resultado = "once"; break;
        	case 12: resultado = "doce"; break;
        	case 13: resultado = "trece"; break;
        	case 14: resultado = "catorce"; break;
        	case 15: resultado = "quince"; break;
        	case 20: resultado = "veinte"; break;
			}
	

		
		if (resultado != "vacio") {
			System.out.println("El número es: " + resultado);
			return;
		} 
		
		switch (decena) {
		
		case 1: // 16, 17, 18 o 19
			decenaTexto = "dieci";
			break;
		case 2:
			decenaTexto = "veinti";
			break;
		case 3:
			decenaTexto = "treinta";
			break;
		case 4:
			decenaTexto = "cuarenta";
			break;
		case 5:
			decenaTexto = "cincuenta";
			break;
		case 6:
			decenaTexto = "sesenta";
			break;
		case 7:
			decenaTexto = "setenta";
			break;
		case 8:
			decenaTexto = "ochenta";
			break;
		case 9:
			decenaTexto = "noventa";
			break;
		default:
			System.out.println("Error");
			return;
		
		}

		
		
		
		
		
			
			
			
		switch (unidad) {
		case 1:
			unidadTexto = "uno";
			break;
		case 2:
			unidadTexto = "dos";
			break;
		case 3:
			unidadTexto = "tres";
			break;
		case 4:
			unidadTexto = "cuatro";
			break;
		case 5:
			unidadTexto = "cinco";
			break;
		case 6:
			unidadTexto = "seis";
			break;
		case 7:
			unidadTexto = "siete";
			break;
		case 8:
			unidadTexto = "ocho";
			break;
		case 9:
			unidadTexto = "nueve";
			break;
		default:
			System.out.println("Error");
			return;
		}
		
		
//		resultado = decenaTexto + unidadTexto;
		
		if (unidad == 0) {
			resultado = decenaTexto;
		} else if (decena == 1 || decena == 2) {
			resultado = decenaTexto + unidadTexto;
		} else {
			resultado = decenaTexto + " y " + unidadTexto;
		}
		
		System.out.println("El número " + numero + " en texto es: " + resultado);
		
	}	
}
