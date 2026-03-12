package unidad4.actividadesAplicacion;

public class Actividad419 {

	public static void main(String[] args) {
		System.out.println("Caso 1:");
		generadorNumeros(2, 0, 10); // (Cantidad de numeros a generar, minimo, maximo)
		System.out.println("Caso 2:"); // Sobrecargada (Cantidad de numeros a generar) - Los números estarán comprendidos entre 0 y 1 utilizando Math.random()
		generadorNumeros(2);
	}

	public static void generadorNumeros(int nGenerar, int minimo, int maximo){
	
		int nGenerados = 0;
		int nAleatorio;
		
		while (nGenerados<nGenerar) { 
			nAleatorio = (int) (Math.random()*100);
			
			
			if (nAleatorio >= minimo && nAleatorio <= maximo) { // El enunciado dice valores máximos que pueden tomar así que tiene que ser <= y >=
				System.out.println(nAleatorio);
				nGenerados++;
			}
			
		}
		
	}
	
	public static void generadorNumeros(int nGenerar){
		
		int nGenerados = 0;
		double nAleatorio;
		
		while (nGenerados<nGenerar) { 
			nAleatorio = Math.random();
			System.out.println(nAleatorio);
			nGenerados++;
		}
	}
}


