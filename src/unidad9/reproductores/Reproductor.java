package unidad9.reproductores;

import java.util.Objects;

public abstract class Reproductor implements Botonera{
	
	private String password;
	private Formatos formato;
	
	public Reproductor() {
		this.password = "1234";
		this.formato = Formatos.WAV;
	}
	
	public Reproductor(String password, Formatos formato) {
		this.password = password;
		this.formato = formato;
	}
	
	void play() {
		
	}
	
	void stop() {
		
	}
	
	void pause() {
		
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(formato, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reproductor other = (Reproductor) obj;
		return formato == other.formato && Objects.equals(password, other.password);
	}
	@Override
	public String toString() {
		return "Reproductor [password=" + password + ", formato=" + formato + "]";
	
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Formatos getFormato() {
		return formato;
	}
	public void setFormato(Formatos formato) {
		this.formato = formato;
	}
	
	
	
	
}
