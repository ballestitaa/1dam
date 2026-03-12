package unidad9.reproductores;

import java.util.Objects;

public class ReproductorWin extends Reproductor {

	private String path;	// siempre son static y final
	
	public ReproductorWin(String password, Formatos formato, String path) {
		super(password, formato);
		this.path = path;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(path);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReproductorWin other = (ReproductorWin) obj;
		return Objects.equals(path, other.path);
	}



	@Override
	public String toString() {
		return "ReproductorWin [path=" + path + "]";
	}



	public String getpath() {
		return path;
	}

	public void setpath(String path) {
		this.path = path;
	}

	@Override
	public void play(Cancion cancion) {
		System.out.printf("WINDOWS: Conectado y reproduciendo " + cancion.getTitulo() +" de "+ cancion.getArtista() + "\nLetra: " + cancion.getLyrics());
		
	}

	@Override
	public void stop(Cancion cancion) {
		System.out.println("¡Adiós desde Windows!");
		
	}

	@Override
	public void pause(Cancion cancion) {
		System.out.println("PAUSANDO WINDOWS");
	}
	
	
	
}
