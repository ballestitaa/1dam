package unidad4.actividadesAplicacion;

public class Actividad418 {

	public static void main(String[] args) {
		
		generadorNumeros(2, 0, 10);
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
}
