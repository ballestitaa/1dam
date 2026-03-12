package unidad9.ejercicioPractico2;
import java.util.Comparator;

public class CocheCilindrajeComparator implements Comparator<Coche> {
	@Override
	public int compare(Coche c1, Coche c2) {
		return Integer.compare(c1.getCilindraje(), c2.getCilindraje());
	}
}
