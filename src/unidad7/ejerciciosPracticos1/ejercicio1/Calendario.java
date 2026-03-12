package unidad7.ejerciciosPracticos1.ejercicio1;

public class Calendario {

	private int year;
	private String month = "Nulo";
	private int intMonth;
	private int day;
	// **********************************
	// He hecho dos versiones, una utilizando un ENUM para los meses, se que es mas sencillo utilizando un array pero quería probar el funcionamiento, y luego la version normal que es compaible con todos los métodos, introduciendo el método con un int.
	// **********************************
	
	Calendario(int year, String month, int day){
		setYear(year);
		setMonthDificil(month);
		setDayDificil(day);
	}
	
	Calendario(int year, int month, int day){
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	
	
	
	boolean iguales(Calendario otraFecha) {
		return (this.year == otraFecha.year && this.month == otraFecha.month
				&& this.day == otraFecha.day);
	}
	
	public void incrementarDia(int incremento) {
		setDay(this.day+incremento);
	}
	
	public void incrementarMes(int incremento) {
		if (this.intMonth + incremento > 12) {
			setMonth(this.intMonth + incremento - 12);
		} else {
			setMonth(this.intMonth + incremento);
		}
	}
	
	public void incrementarAnyo(int incremento) {
		setYear(this.year + incremento);
	}
	
	public void setYear(int year) {
		if (year!=0) {this.year = year;}
		else {System.out.println("ERROR EN EL AÑO");}
	}
	
	public void setMonth(int month) {
		
		if (month>12) {
			System.out.println("ERROR EN EL MES");
		} else {this.intMonth = month;}
		
	}
	
	public void setMonthDificil(String month) {
		boolean encontrado = false;
		for (int i=0; i<Meses.values().length; i++) {
			if (month.equalsIgnoreCase(Meses.values()[i].toString())){
				this.month = month;
				encontrado = true;
				break;
			}
		}
		
		if (!encontrado) {System.out.println("ERROR EN EL MES");}
		
	}

	public void setDay(int day) {
		int maxDias=31;
		
		switch (this.intMonth){
		
		case 2:
			maxDias = 28;
			break;
		
		case 4:  
        case 6: 
        case 9:  
        case 11:
            maxDias = 30;
            break;
            
        default:
		
		}
		
		if (day >= 1 && day <= maxDias) {
			this.day = day;
		} else {System.out.println("ERROR EN EL DÍA: " + day + " no cabe en el mes " + intMonth);}

		
	}
	
	public void setDayDificil(int day) {
		
		int maxDias = 31;
		
			switch (this.month) {
	        case "FEBRERO": 
	            maxDias = 28; 
	            break;
	       
	        case "ABRIL": 
	        case "JUNIO": 
	        case "SEPTIEMBRE": 
	        case "NOVIEMBRE": 
	            maxDias = 30; 
	            break;
	        default:
	        	maxDias = -1;
			}
		if (day <= maxDias) {
			this.day = day;
		} else {System.out.println("ERROR EN EL DÍA");}
		
	}
	
	public String toString() {
		return this.day +"/"+ this.intMonth+"/"+this.year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getIntMonth() {
		return intMonth;
	}

	public void setIntMonth(int intMonth) {
		this.intMonth = intMonth;
	}

	public int getYear() {
		return year;
	}

	public int getDay() {
		return day;
	}
	
	
	
}
