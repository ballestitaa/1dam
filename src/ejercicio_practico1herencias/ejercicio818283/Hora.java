package ejercicio_practico1herencias.ejercicio818283;

public class Hora {
	// instante del tiempo, hora de 0-23 y minutos. 0-59
	
	//constructor (hora,minuto)
	
	//inc() incrementador de valor + 1 minuto
	
	//boolean setMinutos - establece los minutos y si es valido devuelve true
	
	//boolean setHora - lo mismo que setMinutos
	
	//String toString() - @override de la clase Object
	
	private int hora;
	private int minuto;
	
	public Hora() {
		hora = 0;
		minuto = 0;
	}
	
	public Hora(int hora,int minuto) {
		setHora(hora);
		setMinuto(minuto);
	}

	public void inc() {		
		if (minuto == 59) {
			minuto = 0;
			if (hora == 23) {
				hora = 0;
			} else {hora++;}
		} else {minuto++;}
	}
	
	public int getHora() {
		return hora;
	}

	public boolean setHora(int hora) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
			return true;
		} else {return false;}
	}

	public int getMinuto() {
		return minuto;
	}

	public boolean setMinuto(int minuto) {
		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
			return true;
		} else {return false;}
	}
	
	@Override
	public String toString() { 
		return "Son las "+ hora + ":" + minuto;
	}
	
}
