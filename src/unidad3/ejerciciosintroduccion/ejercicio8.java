package unidad3.ejerciciosintroduccion;
import java.util.Scanner;
public class ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int altura; 
        System.out.print("Introduce la altura del triángulo: ");
        altura = sc.nextInt();
        
        for (int i = 1; i <= altura; i++) {
    
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        sc.close();
	}
}