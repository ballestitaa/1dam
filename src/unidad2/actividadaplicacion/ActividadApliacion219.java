package unidad2.actividadaplicacion;
import java.util.Scanner; // Importamos la clase Scanner para poder leer datos del usuario

public class ActividadApliacion219 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para capturar la entrada del teclado (System.in)
        Scanner sc = new Scanner (System.in);
        
        // --- Declaración de variables ---
        double anguloEntrada;      // Almacena el ángulo introducido por el usuario (ej: 400, -50)
        double anguloNormalizado;  // Almacena el ángulo equivalente entre 0 y 360 grados
        double radianes;           // Almacena el resultado final en radianes
        
        // Pedimos al usuario que introduzca un valor
        System.out.println("Introduce el ángulo para pasarlo a radianes:");
        
        // Leemos el valor (de tipo double) y lo guardamos en anguloEntrada
        anguloEntrada = sc.nextDouble();
        
        // Cerramos el objeto Scanner
        sc.close();

        // -------------------------------------------------------------
        // 1. NORMALIZACIÓN: Encontrar el ángulo coterminal entre 0 y 360 grados
        // -------------------------------------------------------------
        
        // Calculamos el resto de dividir el ángulo entre 360.
        // Ej: 400 % 360 = 40.   Ej: -40 % 360 = -40 (el operador % en Java mantiene el signo).
        anguloNormalizado = anguloEntrada % 360;
        
        // Si el resultado del módulo es negativo (solo ocurre si anguloEntrada era negativo),
        // le sumamos 360 para obtener su equivalente positivo (el ángulo coterminal correcto).
        // Ej: -40 se convierte en 320 (-40 + 360 = 320).
        if (anguloNormalizado < 0) {
            anguloNormalizado += 360; 
        }
        
        // -------------------------------------------------------------
        // 2. CONVERSIÓN: Pasar de grados a radianes
        // -------------------------------------------------------------
        
        // La fórmula es: radianes = grados * (PI / 180).
        // Math.PI es la constante para π.
        radianes = anguloNormalizado * (Math.PI / 180.0);
        
        // -------------------------------------------------------------
        // 3. MOSTRAR EL RESULTADO
        // -------------------------------------------------------------
        
        // Si el ángulo original ya estaba en el rango [0, 360), mostramos un mensaje simple.
        if (anguloEntrada >= 0 && anguloEntrada < 360) {
            System.out.println("El ángulo " + anguloEntrada + " en radianes, es: " + radianes);
        } else {
            // Si el ángulo estaba fuera del rango, mostramos su equivalente normalizado
            System.out.println("El ángulo " + anguloEntrada + " es equivalente a " + anguloNormalizado + " grados.");
            // Y luego mostramos la conversión a radianes
            System.out.println("El ángulo " + anguloEntrada + " en radianes, es: " + radianes);
        }
    }
}