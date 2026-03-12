package unidad7.ejemplos.visibilidad.paquete1;

public class B {
	private int atributoB;


	public B(){
	}

	
	public void setAtributoB(int valor) { // si no tienen el mismo nombre no hace falta poner this.
		atributoB = valor;
	}
	
	
	
	public static void metodoDeLaClase(){ // funcion para la q no hace falta q haya un objeto para ejecutarlo
		System.out.println("método static");
	}
	
}
