package ejercicio_practico1herencias.ejercicio818283;

public class HoraExacta extends Hora{
	//horaExata hora minuto segundo
	//setsegundo - 0,59
	//inc +1 segundo
	
	//añadir comparador dos horas para ver si son iguales o distitnas

	private int segundo;
	
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto); // como llamar al constructor explicitamente
		this.segundo = segundo;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {   // si me comparo conmigo mismo, true
				return true;
		}
	
		if (obj == null || this.getClass() != obj.getClass()) { 
			return false; // si no somos ni la misma clase o alguno es nulo, false
		}
		
		HoraExacta otra = (HoraExacta) obj; // casteo el obj into HoraExacta
	
		return this.getHora() == otra.getHora() && 
		           this.getMinuto() == otra.getMinuto() &&  
		           this.segundo == otra.segundo;
	}

	public boolean setSegundo(int segundo) {
		if (segundo >= 0 && segundo < 60) {
			this.segundo = segundo;
			return true;
		} else {return false;}
	}
	
	public int getSegundo() {
		return segundo;
	}

	@Override
	public void inc() {		
		segundo++;
		if (segundo == 60) {
			segundo = 0;
			super.inc();
		}
	}
	

	
	
	
	
}


