
public class debugger {
	public static void main(String[] args) {
	
		String usuario = "Santi";
        int base = 10;
        int altura = 5;
        
        System.out.println("Calculando para: " + usuario);
        
        int area = calcularArea(base, altura); 
        
        System.out.println("El resultado es: " + area);
    	}

	    public static int calcularArea(int b, int h) {
	        int resultado = b * h;
	        return resultado;
	    }
		
}

