package ejercicio_practico3.ejercicio826;

public class CalendarioExacto extends Calendario{
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public CalendarioExacto(int year, int month, int day, int hora, int minuto, int segundo) {
		super(year, month, day);
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public boolean equals(Object obj) {
			
		if (this == obj) {return true;}
		
		if (obj == null || obj.getClass() != this.getClass()) {return false;}
		
		//////// SI PASA DE AQUÍ SIENDO NULO, ERROR NULLPOINTEREXCEPTION
		
		CalendarioExacto fecha2 = (CalendarioExacto) obj;
		
		if (	this.getYear() == fecha2.getYear() 
				&& this.getIntMonth() == fecha2.getIntMonth() 
				&& this.getDay() == fecha2.getDay() 
				&& this.getHora() == fecha2.getHora() 
				&& this.getMinuto() == fecha2.getMinuto() 
				&& this.getSegundo() == fecha2.getSegundo() ) {
			
			return true;
		} 
		return false; // si no entra al if, tiene que ser falso. no hace falta el
					  // else en este caso
	}
	
	@Override
	public String toString() {
		return "CalendarioExacto [año="+super.getYear()+", mes="+super.getIntMonth()+", dia="+super.getDay()+",  hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + "]";
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

}
