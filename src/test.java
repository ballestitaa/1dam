import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int enfado;
		
		
		
		System.out.println("¿Cómo de incoforme está con nuestro serivicio? (1-10)");
		enfado = sc.nextInt();
		gestionarCliente(enfado);
		
		
	}
	
	public static void gestionarCliente (int numero) {
		
		if (numero < 5) {
			System.out.println("Solucionar problema");
		} else if (numero >= 5 && numero <= 7) {
			
			System.out.println("Enviar regalo");
			
		} else if (numero >= 8) {
			System.out.println("Calmar Cliente");
			System.out.println("Enviar regalo");
		}
		
	}

}
