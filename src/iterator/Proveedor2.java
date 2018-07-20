package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Proveedor2 extends Proveedor{

	List<Prenda> prendas = new ArrayList<>();
	
	public Proveedor2() {
		super();
		prendas.add(new Prenda("Pantalones de calité"));
		prendas.add(new Prenda("Camiseta de calité supreme"));
		prendas.add(new Prenda("Gorro roñoso"));
	}

	@Override
	public Iterator<Prenda> createIterator() {
		return prendas.iterator();
	}

}
