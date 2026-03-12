package unidad7.ejemplos.visibilidad.paquete2;

import unidad7.ejemplos.visibilidad.paquete1.B; // importar el paquete

public class C {
	private int atributoC;


	C(){
	
		B prueba = new B(); // el constructor tiene q ser public tambien

	}

}
