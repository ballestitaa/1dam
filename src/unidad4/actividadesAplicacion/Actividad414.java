package unidad4.actividadesAplicacion;

public class Actividad414 {

	public static void main(String[] args) {
		
		System.out.println( calculadoraSegundos(1,0,0) );
		
	}
	
	public static int calculadoraSegundos(int dias, int horas, int minutos) {
		int segundosTotales = 0;
		
		segundosTotales = (dias * 3600 * 24) + (horas * 3600) + (minutos * 60);
		
		return segundosTotales;
	}
}
