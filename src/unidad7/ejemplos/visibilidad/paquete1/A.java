package unidad7.ejemplos.visibilidad.paquete1;

public class A {
	private int atributoA;

	
	
	//para ejecutar codigo, tiene q ser estatico y hay q meterlo en un bloque de ejecucion estatica
	
	static {
		
	}

	A(){
	
		B prueba = new B();
		
		B.metodoDeLaClase();
		
	}

}
