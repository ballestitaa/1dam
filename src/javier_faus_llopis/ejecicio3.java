package javier_faus_llopis;

import java.util.Scanner;

public class ejecicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] atletas = new int[10][4]; 

        System.out.println("Registro de tiempos para 10 atletas (prueba de 5 km)");
        System.out.println("Introduzca horas (>=0), minutos (0-59) y segundos (0-59) para cada atleta.");

        for (int i = 0; i < atletas.length; i++) {
            System.out.printf("\nAtleta %d:%n", i + 1);
            int horas = leerEnteroNoNegativo(sc, "Horas: ");
            int minutos = leerEnteroRango(sc, "Minutos (0-59): ", 0, 59);
            int segundos = leerEnteroRango(sc, "Segundos (0-59): ", 0, 59);

            atletas[i][0] = horas;
            atletas[i][1] = minutos;
            atletas[i][2] = segundos;
            atletas[i][3] = calcularTotalSegundos(horas, minutos, segundos);
        }

        sc.close();

        System.out.println("\nResultados ---");
        mostrarMatriz(atletas);
    }   
  private static int calcularTotalSegundos(int horas, int minutos, int segundos) {
        return horas * 3600 + minutos * 60 + segundos;
    }

 
    private static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
          System.out.printf("Atleta %d: %d horas, %d minutos, %d segundos -- total %d segundos%n",
                    i + 1, m[i][0], m[i][1], m[i][2], m[i][3]);
        }
    }

   
    private static int leerEnteroNoNegativo(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine();
            try {
                int val = Integer.parseInt(line.trim());
                if (val < 0) {
                    System.out.println("Debe ser un número >= 0. Intente de nuevo.");
                    continue;
                }
                return val;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduzca un número entero.");
            }
        }
    }

   
    private static int leerEnteroRango(Scanner sc, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String line = sc.nextLine();
            try {
                int val = Integer.parseInt(line.trim());
                if (val < min || val > max) {
                    System.out.printf("Valor fuera de rango (%d-%d). Intente de nuevo.%n", min, max);
                    continue;
                }
                return val;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduzca un número entero.");
            }
        }
    }
}