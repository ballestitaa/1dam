package unidad9.reproductores;

import java.util.Objects;

public class ReproductorWeb extends Reproductor {

	private String url;	
	
	public ReproductorWeb(String password, Formatos formato, String url) {
		super(password, formato);
		this.url = url;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(url);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReproductorWeb other = (ReproductorWeb) obj;
		return Objects.equals(url, other.url);
	}



	@Override
	public String toString() {
		return "ReproductorWeb [url=" + url + "]";
	}



	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public void play(Cancion cancion) {
		System.out.printf("WEB: Conectado y reproduciendo " + cancion.getTitulo() +" de "+ cancion.getArtista() + "\nLetra: " + cancion.getLyrics());
		
	}

	@Override
	public void stop(Cancion cancion) {
		System.out.println("¡Adiós desde web!");
		
	}

	@Override
	public void pause(Cancion cancion) {
		System.out.println("PAUSANDO LA WEB");
	}
	
	
	
}
