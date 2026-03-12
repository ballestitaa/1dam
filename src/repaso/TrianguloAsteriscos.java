package repaso;
import java.util.Scanner;

public class TrianguloAsteriscos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int repIntro;
		int pisosIntro;
		
		System.out.println("repeticiones");
		repIntro = sc.nextInt();
		System.out.println("pisos");
		pisosIntro = sc.nextInt();
		
		sc.close();
		
		trianguloBucle(repIntro, pisosIntro);
		
	}

	
	
	public static void trianguloBucle(int repeticiones, int pisos) {
		
		do {
			for (int i=0; i < pisos; i++) {
				System.out.println("");
				for (int j=pisos; j>i; j--) {
					System.out.print("*");
				}
			}
			for (int i=1; i < pisos; i++) {
				System.out.println("");
				for (int j=0; j<=i; j++) {
					System.out.print("*");
				}
			}
			
			repeticiones--;
		} while (repeticiones >0);
		}
}
