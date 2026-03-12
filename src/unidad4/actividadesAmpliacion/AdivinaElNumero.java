package unidad4.actividadesAmpliacion;
import java.util.Scanner;
public class AdivinaElNumero {

	public static void main(String[] args) {
		int vidas = 3;
		
		evaluarIntento(pedirNumero(vidas), generarNumero(), vidas );
		
		
		
	}

	public static int generarNumero() {
		int numeroGenerado;
		
		
		do {
		numeroGenerado = (int) (Math.random() * 100);
		} while (numeroGenerado > 10); // Los numeros deben ser menores a 10
		
		return numeroGenerado;
	}
	
	
	
	
	public static int pedirNumero(int vidas) {
		Scanner sc = new Scanner(System.in);
		int numeroIntroducido;

		System.out.println(" - Adivine el número:");
		System.out.println(" - Te quedan "+vidas+" vidas.");
		numeroIntroducido = sc.nextInt();

		return numeroIntroducido;
		
	}
	
	
	
	
	public static void evaluarIntento(int intento, int numeroSecreto, int vidas) {
		// System.out.println(numeroSecreto); // Saber número a adivinar.
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println();
		if (intento > numeroSecreto) {
			System.out.println("- El número es menor al que has dicho");
		} else if (intento < numeroSecreto) {
			System.out.println("- El número es mayor al que has dicho");
		}
		
		
		if (intento == numeroSecreto && vidas>0) {
			System.out.println(" --- Enhorabuena, has acertado. --- ");
		} else if (vidas==1){
			System.out.println(" --- ¡Te has quedado sin vidas y has perdido! --- ");
		} else {
			vidas--;
			evaluarIntento(pedirNumero(vidas), numeroSecreto, vidas);
		}
		
		
	}
}
