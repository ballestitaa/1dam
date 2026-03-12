package unidad9.ejercicioPractico1;

public abstract class Vehiculo {
	 protected float combustible;
	 protected int pasajeros;
	 protected int ruedas;
	 
	 public Vehiculo(float combustible, int pasajeros, int ruedas) {
		 setCombustible(combustible);
		 setPasajeros(pasajeros);
		 setRuedas(ruedas);
	 }
	 
	 public void arrancar() {
		 System.out.println("El vehículo está arrancando...");
	 }

	 public float getCombustible() {
		 return combustible;
	 }

	 public void setCombustible(float combustible) {
		 this.combustible = combustible;
	 }

	 public int getPasajeros() {
		 return pasajeros;
	 }

	 public void setPasajeros(int pasajeros) {
		 this.pasajeros = pasajeros;
	 }

	 public int getRuedas() {
		 return ruedas;
	 }

	 public void setRuedas(int ruedas) {
		 this.ruedas = ruedas;
	 }
	 
	 
	 
	 
}

