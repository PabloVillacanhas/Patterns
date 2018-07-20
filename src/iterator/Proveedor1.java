package iterator;

import java.util.Iterator;

public class Proveedor1 extends Proveedor{

	Prenda[] prendas = {new Prenda("Pantalones vaqueros"), 
			new Prenda("Camiseta roja"), 
			new Prenda("Camiseta negra"), 
			new Prenda("Camiseta azul")};
	
	@Override
	public Iterator<Prenda> createIterator() {
		return new Proveedor1Iterator(prendas);
	}
}
