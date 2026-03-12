package unidad4;

public class EjemploFunciones {

	public static void main(String[] args) {
		int a = 3, b = 4, c = 5;
		float media;
		media = media(a,b,c);
		
		System.out.println(media);
	}

	
	
	
	public static float media(int n1, int n2, int n3) {
		float resultado = (n1 + n2 + n3) / 3;
		return resultado; // devolver resultado
	}
	
	
}



