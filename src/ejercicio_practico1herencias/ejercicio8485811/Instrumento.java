package ejercicio_practico1herencias.ejercicio8485811;

import java.util.Arrays;

public abstract class Instrumento {

	protected Nota[] melodia;
	
	public Instrumento() {
		melodia = new Nota[0];
	}
	
	public void add (Nota nota) {
		melodia = Arrays.copyOf(melodia, melodia.length +1); // "redimensionar" el array
		melodia[melodia.length - 1] = nota; // la nota nueva la meto en el ultimo hueco del array, el que acabo de poner
	}

	public abstract void interpretar();
}
