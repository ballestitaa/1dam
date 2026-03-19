package unidad12.ejerciciosPracticos.actividad25;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = """
                1. Dar de alta
                2. Dar de baja
                3. Modificar
                4. Listar por nombre
                5. Listar por antigüedad
                6. Salir
                """;

        Map<String, Socio> socios = new HashMap<>();

        int eleccion;

        do{

            System.out.println(menu);

            eleccion = sc.nextInt();

            switch (eleccion){
                case 1:
                    altaSocio(socios, sc);
                    break;

                case 2:
                    if (bajaSocio(socios, sc)){
                        System.out.println("Socio eliminado");
                    } else{
                        System.out.println("Socio no encontrado.");
                    } break;

                case 3:
                    modificarSocio(socios, sc);
                    break;

                case 4:
                    listarNombre(socios);
                    break;

                case 5:
                    listarAntiguedad(socios);
                    break;
                default:
                    break;
            }

        } while (eleccion != 6);



        sc.close();
    }


    public static void altaSocio(Map<String, Socio> socios, Scanner sc){
        String apodo;
        String nombre;
        DateTimeFormatter formatoEuropeo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaAlta = LocalDate.now().format(formatoEuropeo);


        System.out.println("Introduzca el apodo del socio.");
        apodo = sc.next();



        if (socios.containsKey(apodo)){
            System.out.println("El socio ya existe");
            return;
        }

        System.out.println("Introduzca el nombre del socio.");
        nombre = sc.next();

        socios.put(apodo, new Socio(apodo, nombre, fechaAlta));
    }




    public static boolean bajaSocio(Map<String, Socio> socios, Scanner sc){
        String apodo;

        System.out.println("Introduzca el apodo del socio a dar de baja.");
        apodo = sc.next();

        return socios.remove(apodo) != null; // remove en maps devuelve el objeto eliminado. lo comparo con null para ver si ha eliminado algo o no
    }




    public static void modificarSocio(Map<String, Socio> socios, Scanner sc) {

        String apodo;
        String nombre;
        DateTimeFormatter formatoEuropeo = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Introduzca el apodo del socio a modificar.");
        apodo = sc.next();

        if (socios.containsKey(apodo)){
            String fechaAlta = buscarSocio(socios, apodo).getFechaAlta().format(formatoEuropeo).toString();
            System.out.println("Introduce el nuevo nombre");
            nombre = sc.next();
            socios.put(apodo, new Socio(apodo, nombre, fechaAlta));
            System.out.println("Socio modificado");

        } else System.out.println("El socio no está dado de alta");


    }



    public static Socio buscarSocio(Map<String, Socio> socios, String apodo) {
        return socios.get(apodo);
    }


    public static void listarNombre(Map<String, Socio> socios){
        List<Socio> lista = new ArrayList<>(socios.values());

        Comparator<Socio> comparadorNombre = new Comparator<Socio>() {
            @Override
            public int compare(Socio s1, Socio s2) {
                return s1.getNombre().compareTo(s2.getNombre());
            }
        };

        Collections.sort(lista, comparadorNombre);

        System.out.println("Socios por nombre:");
        for (Socio s : lista){
            System.out.println(s.toString());
        }

    }

    public static void listarAntiguedad(Map<String, Socio> socios){
        List<Socio> lista = new ArrayList<>(socios.values());

        Comparator<Socio> comparadorAntiguedad = new Comparator<Socio>() {
            @Override
            public int compare(Socio s1, Socio s2) {
                return s1.getFechaAlta().compareTo(s2.getFechaAlta());
            }
        };

        Collections.sort(lista, comparadorAntiguedad);

        System.out.println("Socios por antigüedad:");
        for (Socio s : lista){
            System.out.println(s.toString());
        }
    }

    public static String generarFechaAleatoria() {
        int anio = (int) (Math.random() * 25) + 2000;
        int mes = (int) (Math.random() * 12) + 1;
        int dia = (int) (Math.random() * 28) + 1;
        return String.format("%02d/%02d/%d", dia, mes, anio);
    }



} // fin class
