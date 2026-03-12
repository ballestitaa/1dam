package unidad9.reproductores;

public class App {

	public static void main(String[] args) {

		// Botonera botonera = new Botonera(); NO SE PUEDE INSTANCIAR, ES ABSTRACTA SIEMPRE
		
		ReproductorWeb RWeb = new ReproductorWeb("1234", Formatos.MP3, "www.spotify.com");
		
		ReproductorWin RWin = new ReproductorWin("1234", Formatos.OGG, "C:/ReproductorWindows");
		
		Cancion GigoloEuropeo = new Cancion("Gigolo Europeo", "yyy891 aka la influencia", "Urbano", 2023, 241, "Que solo sienta el bounce, que solo sienta el bounce...");
		
		RWeb.play(GigoloEuropeo);
		
		RWin.play(GigoloEuropeo);
		
		Botonera botoneraWeb = RWeb; // ni puta idea de pq funciona ni para q funciona
		
		botoneraWeb.play(GigoloEuropeo);
		
		
		
		
	}

}
