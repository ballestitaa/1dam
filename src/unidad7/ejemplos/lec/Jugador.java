package unidad7.ejemplos.lec;

public class Jugador {

	// objetos, se crean con una sola class (una clase, un archivo)
	// SIN MAIN
	
	
	
	// Principio de creación de objeto
	
	// Atributos
	
	//Siempre damos el menor acceso posible, solo se ponen en public los estrictamente necesarios
	private String nombre;
	private String rol;
	private String equipo;
	private float kda;
	private float csMedio;
	private int partidosJugados;
	
	// Métodos (funcionalidades / acciones)
	
		// CONSTRUCTORES = NOMBRE DE CLASE
		// Crean el objeto y le meten la info
		// No se pone void ni nada ya que "devuelve" un jugador
		public Jugador( String nombre, String rol, String equipo, float kda, float csMedio, int partidosJugados ){
			
			this.nombre=nombre;
			this.rol=rol; // La variable rol = rol de argumento de entrada
			this.equipo=equipo;
			this.kda=kda;
			this.partidosJugados=partidosJugados;
			
			//para hacer referencia a otro constructor, por ejemplo, q solo tiene rol y equipo, pones this(rol,equipo)
			
			
			
			setCsMedio(csMedio); // tengo la logica de control de entrada centralizada en el getter. NO repito código
			/*
			if (csMedio<30) {   // control de entrada
				this.csMedio=0;
			} else {
				this.csMedio=csMedio;
			}
			*/
		}
		
		public Jugador( Jugador inJugador ){
		
			this.nombre = inJugador.nombre;
			this.rol = inJugador.rol;
			this.equipo = inJugador.equipo;
			this.kda=inJugador.kda;
			this.partidosJugados=inJugador.partidosJugados;
			
		}
		
		// Constructor por defecto - 0 argumentos - SI cuerpo. si no me dices datos, algo tendré que hacer
		
		Jugador(){
			this.nombre= "nulo" ; // son strings, meterle -1 no tiene sentido jefe
			this.rol= "nulo" ;	  // no tienes pq ponerle nulo, puede ser "MARICON" pero no queda bonito
			this.equipo= "nulo" ;
			this.kda=-1;
			this.partidosJugados=-1;
			this.csMedio=-1;
		}
		
		
		//public o private o default(cuando no pones nada) son modificadores de acceso
		
		// METODOS GET Y SET (Consulta / comando) 
		
		public float getCsMedio() { 
			return csMedio;
		}
		
		
		public void setCsMedio(float csMedio) {
			this.csMedio = csMedio;
			
			if (csMedio<30) {   // control de entrada
				this.csMedio=0;
			} else {
				this.csMedio=csMedio;
			}
		
			// La idea es poner la limitacion del setter igual que la del constructor.
			
		}
		
		
		// METODOS PUBLICOS (comportamientos, métodos de dominio, métodos de negocio...)
		
		
		
		public float minionsTotales() {
			
			return csMedio*partidosJugados;
			
		}
		
		public void imprimir() {
			System.out.println("Mi nombre es "+nombre +", juego de "+rol+" y juego para el equipo " + equipo);
		}
	
		
		public String toString() { // metodo canonico. si le metes syso(Jugador) te saca directamente el toString
			return "Jugador[nombre:"+nombre +", rol:"+rol+", equipo:" + equipo+"]";
		}
	

}
