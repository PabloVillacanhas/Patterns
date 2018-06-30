package facade;

import java.util.ArrayList;
import java.util.List;

public class DiscoDuro {

	private List<Particion> particiones = new ArrayList<>();

	public DiscoDuro(List<Particion> particiones) {
		super();
		this.particiones = particiones;
	}

	public void addParticion(Particion particion) {
		particiones.add(particion);
	}

	public List<Particion> getParticiones() {
		return particiones;
	}

	public void encender() {
		System.out.println("Encendiendo disco duro");
	}

	public void apagar() {
		System.out.println("Apagando disco duro");
	}

	public void verificar() {
		System.out.println("Verificando disco duro...");
	}
}
