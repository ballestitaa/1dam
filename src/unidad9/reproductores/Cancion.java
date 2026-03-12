package unidad9.reproductores;

public class Cancion implements Comparable<Cancion>{
	private String titulo;
	private String artista;
	private String genero;
	private int anyoSalida;
	private int duracionSegundos;
	private String lyrics;
	
	
	public Cancion(String titulo, String artista, String genero, int anyoSalida, int duracionSegundos, String lyrics) {
		this.titulo = titulo;
		this.artista = artista;
		this.genero = genero;
		this.anyoSalida = anyoSalida;
		this.duracionSegundos = duracionSegundos;
		this.lyrics = lyrics;
	}
	
	
	
	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", artista=" + artista + ", genero=" + genero + ", anyoSalida="
				+ anyoSalida + ", duracionSegundos=" + duracionSegundos + ", lyrics=" + lyrics + "]";
	}
	


	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAnyoSalida() {
		return anyoSalida;
	}
	public void setAnyoSalida(int anyoSalida) {
		this.anyoSalida = anyoSalida;
	}
	public int getDuracionSegundos() {
		return duracionSegundos;
	}
	public void setDuracionSegundos(int duracionSegundos) {
		this.duracionSegundos = duracionSegundos;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	@Override
	public int compareTo(Cancion o) { //       -1 a<b     0 IGUAL    +1 a>b
		if(this.duracionSegundos > o.duracionSegundos) {
			return 1;
		} else if (this.duracionSegundos < o.duracionSegundos) {
			return -1;
		} else {return 0;}
		
	}
	
	
	
}
