package iterator;

import java.util.Iterator;

public class Proveedor1Iterator implements Iterator<Prenda>{

	Prenda[] prendas;
	int index = 0;
	
	public Proveedor1Iterator(Prenda[] prendas) {
		super();
		this.prendas = prendas;
	}

	@Override
	public boolean hasNext() {
		if (prendas.length <= index || prendas[index] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Prenda next() {
		Prenda p = prendas[index];
		index++;
		return p;
	}

}
