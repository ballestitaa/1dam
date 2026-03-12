package unidad4;

public class funcionRecursiva {

	public static void main(String[] args) {
		
		holaMundo(0);
	}

	public static void holaMundo(int nVeces) {
		
		
		if (nVeces > 0) {
		
			if (nVeces==1){
				System.out.println("Hola, soy una funcion recursiva");
			} else {
				holaMundo(nVeces-1);
				System.out.println("Hola, soy una funcion recursiva");
			}
		
		} else {
			System.out.println("¡Error! No introduzcas números negativos ni 0...");
		}
	
	}
}
