package unidad9.ejercicioPractico2;
import java.util.Comparator;
public class AvionAlturaComparator implements Comparator<Avion> {
	@Override
	public int compare(Avion a1, Avion a2) {
		return Float.compare(a1.getAltura(), a2.getAltura());
	}
}

