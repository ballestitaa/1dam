package unidad9.actividadGrupal;

import java.util.Objects;

public class Departamento {
	int articuloID;
	String titulo;
	int numPaginas;
	Investigador investigadores[];
	
	public int getArticuloID() {
		return articuloID;
	}
	public void setArticuloID(int articuloID) {
		this.articuloID = articuloID;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	
	
	@Override
	public String toString() {
		return "Departamento [articuloID=" + articuloID + ", titulo=" + titulo + ", numPaginas=" + numPaginas + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(articuloID, numPaginas, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return articuloID == other.articuloID && numPaginas == other.numPaginas && Objects.equals(titulo, other.titulo);
	}
	
	
	
	
	public Departamento(int articuloID, String titulo, int numPaginas, Investigador[] investigadores) {
		super();
		this.articuloID = articuloID;
		this.titulo = titulo;
		this.numPaginas = numPaginas;
		this.investigadores = investigadores;
	}
	
	
	
		
}

