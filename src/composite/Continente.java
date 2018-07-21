package composite;

import java.util.Iterator;

public class Continente extends Composite {

	public Continente(String nombre) {
		super(nombre);
	};

	@Override
	public int getPoblacion() {
		Iterator<Territorio> iterator = getChilds().iterator();
		int poblacion = 0;
		while (iterator.hasNext()) {
			poblacion += iterator.next().getPoblacion();
		}
		return poblacion;
	}
}
