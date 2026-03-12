package santiago_ballesta_carmona.ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		int tiempos [][];
		tiempos = new int [10][4];
		
		rellenarMatriz(tiempos);
		//rellenarMatrizAutomaticamente(tiempos);
		//Puedes usar la funcion de arriba para no tener que meter los 40 valores a mano
		mostrarMatriz(tiempos);
		
		
		
	}
	
	public static void rellenarMatriz(int[][] tiempos) {
		Scanner sc = new Scanner(System.in);
		
		for (int filas = 0; filas<tiempos.length; filas++) {
			for (int columnas = 0; columnas < tiempos[filas].length; columnas++) {
				if(columnas == 0) {//horas
					System.out.println("Introduce las horas del atleta "+filas);
					tiempos[filas][columnas] = sc.nextInt();
					
				} else if(columnas == 1) { //minutos
					System.out.println("Introduce los minutos del atleta "+filas);
					tiempos[filas][columnas] = validadorMinutosySegundos();
				} else if (columnas == 2) { //segundos
					System.out.println("Introduce los segundos del atleta "+filas);
					tiempos[filas][columnas] = validadorMinutosySegundos();
				}
				
			}
		}
	}
	
	public static int validadorMinutosySegundos() {
		Scanner sc = new Scanner(System.in);
		int tiempo = -1;
		do {
			tiempo = sc.nextInt();
			if (tiempo >=0 && tiempo<=59) {
				return tiempo;
			} else {
				System.out.println("Error, este valor debe estar comprendido entre 0 y 59. Por favor, reintroduzca el valor");
			}
		} while (true);
	}
	
	public static void rellenarMatrizAutomaticamente(int[][] tiempos) {
		for (int filas = 0; filas<tiempos.length; filas++) {
			for (int columnas = 0; columnas < tiempos[filas].length; columnas++) {
				
				if(columnas == 0) {
					tiempos[filas][columnas] = (int) (Math.random() * 10);
				} else if(columnas == 1 || columnas == 2) {
						do {
							tiempos[filas][columnas] = (int) (Math.random() * 100);
						} while (tiempos[filas][columnas] > 60);
				}
				
			}
		}
	}
	
	public static void mostrarMatriz(int[][] tiempos) {
		for (int filas = 0; filas<tiempos.length; filas++) {
			System.out.println("Atleta "+filas+": "+tiempos[filas][0]+" horas, "+tiempos[filas][1]+" minutos, "+tiempos[filas][2]+" segundos. - TOTAL: " + calcularTotalSegundos(tiempos[filas][0], tiempos[filas][1], tiempos[filas][2])+" segundos.");
		}
	}
		
	
	
	public static int calcularTotalSegundos(int horas, int minutos, int segundos) {
		return ((horas * 3600) + (minutos * 60) + segundos);
	}

}
