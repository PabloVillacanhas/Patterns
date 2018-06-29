package adapter;

import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
	List<Avion> aviones = new ArrayList<>();

	public List<Avion> getAviones() {
		return aviones;
	}

	public void addAvion(Avion avion) {
		aviones.add(avion);
	}
}
