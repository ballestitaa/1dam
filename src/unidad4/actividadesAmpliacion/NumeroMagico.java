package unidad4.actividadesAmpliacion;
import java.util.Scanner;
import java.util.Random;

public class NumeroMagico {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        String respuesta;
        int intento;

        do {
            final int CANTIDAD = 5;
            int INDICE_MAGICO = rand.nextInt(CANTIDAD) + 1;
            int numeroMagico = -1; 
            
            System.out.print("Números: "); 

            for (int i = 1; i <= CANTIDAD; i++) {
                int n = rand.nextInt(10) + 1;
                
                System.out.print(n + " "); 
                
                if (i == INDICE_MAGICO) {
                    numeroMagico = n; 
                }
            }
            System.out.println("\n");
            
            System.out.println("¿Cuál crees que es el número mágico?");
            
            intento = sc.nextInt();
            sc.nextLine();

            if (intento == numeroMagico) {
                System.out.println("¡Acertaste!");
            } else {
                System.out.println("Fallaste, era " + numeroMagico);
            }
            
            System.out.println("\n¿Quieres jugar otra vez? (Si/No)");
            
            respuesta = sc.nextLine();
            
        } while (!respuesta.equalsIgnoreCase("No"));
        
        System.out.println("¡Juego terminado!");
        sc.close();
    }
}

