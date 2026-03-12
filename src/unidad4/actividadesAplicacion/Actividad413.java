package unidad4.actividadesAplicacion;

public class Actividad413 {

	public static void main(String[] args) {

		muestraPares(10);
		
	}

	public static void muestraPares(int n) {

		int parActual = 0;
		int paresEncontrados = 0;
		
		
		while (paresEncontrados<n){
			System.out.println(parActual+=2);
			paresEncontrados++;
		}
		
	}
}
