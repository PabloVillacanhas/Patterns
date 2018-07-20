package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {

	List<Proveedor> proveedores = new ArrayList<>();
	
	
	public Cliente(Proveedor... proveedores) {
		super();
		for(Proveedor p : proveedores){
			this.proveedores.add(p);
		}
	}


	public void revisarMercancía() {
		List<Iterator<Prenda>> iterators = new ArrayList<>();
		for(Proveedor p : proveedores){
			iterators.add(p.createIterator());
		}
		for(Iterator<Prenda> i: iterators) {
			revisarMercancia(i);
		}
	}


	private void revisarMercancia(Iterator<Prenda> i) {
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
