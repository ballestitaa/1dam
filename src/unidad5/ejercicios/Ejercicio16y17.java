package unidad5.ejercicios;

public class Ejercicio16y17 {

	public static void main(String[] args) {

		float [][] notas = {
				
				{1,2,3},
				{4,5,6}
		};
		
		
		for (int filas=0; filas<notas.length;filas++) {
			float acumulador=0;
			float media=0;
			for (int columnas=0; columnas<notas[filas].length;columnas++) {
				System.out.print(notas[filas][columnas]+"  ");
				acumulador+=notas[filas][columnas];
			}
			
			media = acumulador/notas[0].length;
			
			System.out.print("MEDIA = "+ media);
			
			System.out.println();
			System.out.println("--------------");
		}
		
	}

}
