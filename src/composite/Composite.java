package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements Territorio {

	String nombre;
	List<Territorio> territorios = new ArrayList<Territorio>();

	public Composite(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void addTerritorio(Territorio territorio) {
		territorios.add(territorio);
	}

	public List<Territorio> getChilds() {
		return territorios;
	}

	public void remove(Territorio territorio) {
		territorios.removeIf(t -> t.equals(territorio));
	}
}
