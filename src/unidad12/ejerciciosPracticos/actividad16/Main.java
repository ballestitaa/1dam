package unidad12.ejerciciosPracticos.actividad16;
import java.nio.file.LinkOption;
import java.time.LocalDate;
import java.util.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = """
                1. Dar de alta
                2. Dar de baja
                3. Modificar
                4. Listar por nombre
                5. Listar por antigüedad
                """;

        TreeSet<Socio> socios = new TreeSet<>();

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
                    eleccion = 6;
                    break;
            }

        } while (eleccion != 6);



        sc.close();
    }




    public static void altaSocio(TreeSet<Socio> socios, Scanner sc){
        String dni;
        String nombre;
        DateTimeFormatter formatoEuropeo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaAlta = LocalDate.now().format(formatoEuropeo);


        System.out.println("Introduzca el DNI del socio.");
        dni = sc.next();



        if (socios.contains(new Socio(dni))) {
            System.out.println("El socio ya existe");
            return;
        }

        System.out.println("Introduzca el nombre del socio.");
        nombre = sc.next();


        socios.add(new Socio(dni, nombre, fechaAlta));
    }




    public static boolean bajaSocio(TreeSet<Socio> socios, Scanner sc){
        String dni;

        System.out.println("Introduzca el DNI del socio a dar de baja.");
        dni = sc.next();

        return socios.remove(new Socio(dni));
    }




    public static void modificarSocio(TreeSet<Socio> socios, Scanner sc) {

        String dni;
        String nombre;
        DateTimeFormatter formatoEuropeo = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Introduzca el DNI del socio a modificar.");
        dni = sc.next();

        if (socios.contains(new Socio(dni))){
            String fechaAlta = buscarSocio(socios, dni).getFechaAlta().format(formatoEuropeo).toString();

            socios.remove(new Socio(dni));
            System.out.println("Introduce el nuevo nombre");
            nombre = sc.next();
            socios.add(new Socio(dni, nombre, fechaAlta));
            System.out.println("Socio modificado");

        } else System.out.println("El socio no está dado de alta");


    }



    public static Socio buscarSocio(TreeSet<Socio> socios, String dni) {
        for (Socio s : socios) {
            if (s.getDni().equals(dni)) {
                return s;
            }
        }
        return null;
    }


    public static void listarNombre(TreeSet<Socio> socios){
        List<Socio> lista = new ArrayList<>(socios);

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

    public static void listarAntiguedad(TreeSet<Socio> socios){
        List<Socio> lista = new ArrayList<>(socios);

        Comparator<Socio> comparadorAntiguedad = new Comparator<Socio>() {
            @Override
            public int compare(Socio s1, Socio s2) {
                if (s1.antiguedad() > s2.antiguedad()){
                    return 1;
                } else if (s1.antiguedad() < s2.antiguedad()) {
                    return -1;
                } else return 0;
            }
        };

        Collections.sort(lista, comparadorAntiguedad);

        System.out.println("Socios por antiguedd:");
        for (Socio s : lista){
            System.out.println(s.toString());
        }

    }

} // fin class
