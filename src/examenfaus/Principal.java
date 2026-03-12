package examenfaus;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 100;
        Alojamiento[] alojamientos = new Alojamiento[MAX];
        int count = 0;

        while (true) {
            System.out.println("\n--- GESTIÓN ALOJAMIENTOS ---");
            System.out.println("1. Añadir Apartamento");
            System.out.println("2. Añadir Habitación de Hotel");
            System.out.println("3. Añadir Casa Rural");
            System.out.println("4. Listar alojamientos");
            System.out.println("5. Salir");
            System.out.print("Elige opción: ");

            String opcion = sc.nextLine().trim();
            if (opcion.equals("1")) {
                if (count >= MAX) {
                    System.out.println("Array lleno, no se pueden añadir más alojamientos.");
                    continue;
                }
                try {
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();
                    System.out.print("Capacidad: ");
                    int capacidad = Integer.parseInt(sc.nextLine());
                    System.out.print("Precio por noche: ");
                    double precio = Double.parseDouble(sc.nextLine());
                    System.out.print("Número de habitaciones: ");
                    int numHab = Integer.parseInt(sc.nextLine());
                    System.out.print("Tiene terraza : ");
                    boolean terraza = Boolean.parseBoolean(sc.nextLine());
                    alojamientos[count++] = new Apartamento(codigo, direccion, capacidad, precio, numHab, terraza);
                    System.out.println("Apartamento añadido.");
                } catch (Exception e) {
                    System.out.println("Error en los datos. No se añadió el apartamento.");
                }
            } else if (opcion.equals("2")) {
                if (count >= MAX) {
                    System.out.println("Array lleno, no se pueden añadir más alojamientos.");
                    continue;
                }
                try {
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();
                    System.out.print("Capacidad: ");
                    int capacidad = Integer.parseInt(sc.nextLine());
                    System.out.print("Precio por noche : ");
                    double precio = Double.parseDouble(sc.nextLine());
                    System.out.print("Número de camas : ");
                    int camas = Integer.parseInt(sc.nextLine());
                    System.out.print("Incluye desayuno : ");
                    boolean desayuno = Boolean.parseBoolean(sc.nextLine());
                    alojamientos[count++] = new HabitacionHotel(codigo, direccion, capacidad, precio, camas, desayuno);
                    System.out.println("Habitación de hotel añadida.");
                } catch (Exception e) {
                    System.out.println("Error en los datos. No se añadió la habitación.");
                }
            } else if (opcion.equals("3")) {
                if (count >= MAX) {
                    System.out.println("Array lleno, no se pueden añadir más alojamientos.");
                    continue;
                }
                try {
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();
                    System.out.print("Capacidad : ");
                    int capacidad = Integer.parseInt(sc.nextLine());
                    System.out.print("Precio por noche : ");
                    double precio = Double.parseDouble(sc.nextLine());
                    System.out.print("Metros de terreno: ");
                    double metros = Double.parseDouble(sc.nextLine());
                    System.out.print("Tiene piscina: ");
                    boolean piscina = Boolean.parseBoolean(sc.nextLine());
                    alojamientos[count++] = new CasaRural(codigo, direccion, capacidad, precio, metros, piscina);
                    System.out.println("Casa rural añadida.");
                } catch (Exception e) {
                    System.out.println("Error en los datos. No se añadió la casa rural.");
                }
            } else if (opcion.equals("4")) {
                if (count == 0) {
                    System.out.println("No hay alojamientos.");
                } else {
                    System.out.println("\n LISTADO ALOJAMIENTOS ");
                    for (int i = 0; i < count; i++) {
                        Alojamiento a = alojamientos[i];
                        if (a instanceof Apartamento) {
                            ((Apartamento) a).mostrarInformacion();
                        } else if (a instanceof HabitacionHotel) {
                            ((HabitacionHotel) a).mostrarInformacion();
                        } else if (a instanceof CasaRural) {
                            ((CasaRural) a).mostrarInformacion();
                        } else {
                            System.out.println(a.toString());
                        }
                        System.out.println("-----");
                    }
                }
            } else if (opcion.equals("5")) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}
