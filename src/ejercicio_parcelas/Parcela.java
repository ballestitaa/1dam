package ejercicio_parcelas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parcela {
	private String identificador;
	private double area;
	private String dni;
	private TipoParcela tipoParcela;
	
	public Parcela() {
		this.identificador = null;
		this.area = 0;
		this.dni = null;
	}
	
	public Parcela (String identificador, int area, String dni, String tipoParcelaLetra) {
		
		setIdentificador(identificador);
		setArea(area);
		setDni(dni);
		tipoParcelaLetra(tipoParcelaLetra);
		
	}
	
	

	public void mostrarDatos() {
		System.out.println("ID");
		System.out.println(getIdentificador());
		System.out.println("Area");
		System.out.println(getArea());
		System.out.println("DNI");
		System.out.println(getDni());
		System.out.println("Tipo Parcela");
		System.out.println(getTipoParcela());
	}
	
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		if (identificador.length() > 4) {
			System.out.println("ERROR");
			return;
		} else {
			this.identificador = identificador;
		}
	}

	public double getArea() {
		return (area / 10000);
	}

	public void setArea(double area) {
		this.area = area * 10000;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (esDniCifValido(dni)) {
			this.dni = dni;
		} else {
			System.out.println("Error, el dni no es válido");
		}
	}
	
	public static boolean esDniCifValido(String dniCif) {
        String regex = "^[0-9]{8}[A-Za-z]$";
        return validarRegex(dniCif, regex);
    }
	
	private static boolean validarRegex(String input, String regex) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

	public TipoParcela getTipoParcela() {
		return tipoParcela;
	}

	public void tipoParcelaLetra(String letra) {
		
		letra = letra.toUpperCase();
		
		switch (letra) {
		case "A": setTipoParcela(TipoParcela.RURAL);
		break;
		case "B": setTipoParcela(TipoParcela.URBANA);
		break;
		case "C": setTipoParcela(TipoParcela.INDUSTRIAL); 
		break;
		default: System.out.println("Error");
		
		}
	}
	
	public void setTipoParcela(TipoParcela tipoParcela) {
		this.tipoParcela = tipoParcela;
	}
	
	
}
