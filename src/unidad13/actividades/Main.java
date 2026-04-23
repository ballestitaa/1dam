package unidad13.actividades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int eleccion;

        Socio s1 = new Socio("11111111A", "Ana", LocalDate.of(1990, 1, 1), LocalDate.of(2004, 1, 3), 500, 2);
        Socio s2 = new Socio("33333333C", "Carlos", LocalDate.of(1985, 5, 12), LocalDate.now(), 600, 1);
        Socio s3 = new Socio("22222222B", "Beatriz", LocalDate.of(1992, 11, 23), LocalDate.now(), 45, 0);
        Socio s4 = new Socio("44444444D", "David", LocalDate.of(1978, 3, 30), LocalDate.now(), 70, 3);
        Socio s5 = new Socio("11111111A", "Ana Repetida", LocalDate.of(1990, 1, 1), LocalDate.now(), 50, 2);

        List<Socio> lista = new ArrayList<>();
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        lista.add(s4);
        lista.add(s5);

        System.out.println();
        System.out.println("Ejercicio 16");
        lista.stream()
                .filter(socio -> socio.getCuota() > 100 && socio.getNombre().startsWith("A"))
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Ejercicio 17");
        System.out.println(s1.edad() + " años de edad.");
        System.out.println(s1.antiguedad() + " meses de alta.");

        System.out.println();
        System.out.println("Ejercicio 18");

        lista.stream()
                .sorted()
                .map(Socio::getDni)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Ejercicio 19");

        String[] tablaDni = lista.stream()
                .sorted()
                .map(Socio::getDni)
                .toArray(String[]::new);

        System.out.println();
        System.out.println("Ejercicio 20");

        List<String> listaDni = lista.stream()
                .sorted()
                .map(Socio::getDni)
                .toList();


        System.out.println();
        System.out.println("Ejercicio 21");

        lista.stream()
                .map(Socio::getNombre)
                .sorted()
                .forEach(System.out::println);



        System.out.println();
        System.out.println("Ejercicio 22");

        Double mediaFamiliares = lista.stream()
                .mapToInt(Socio::getFamiliares)
                .average()
                .orElse(0.0);

        System.out.println(mediaFamiliares + " familiares de media.");
    }
}