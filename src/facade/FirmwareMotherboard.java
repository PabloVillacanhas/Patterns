package facade;

import java.util.ArrayList;
import java.util.List;

public class FirmwareMotherboard {

	private Bootstrap bootstrap;
	private PlacaBase pb;

	public FirmwareMotherboard(Bootstrap bootstrap, PlacaBase placaBase) {
		super();
		this.bootstrap = bootstrap;
		this.pb = placaBase;
	}

	public Bootstrap getBootstrap() {
		return bootstrap;
	}

	public void setBootstrap(Bootstrap bootstrap) {
		this.bootstrap = bootstrap;
	}

	public PlacaBase getPb() {
		return pb;
	}

	public void setPb(PlacaBase pb) {
		this.pb = pb;
	}

	public void ejecutarPOST() {
		// Verificamos componentes del ordenador
		pb.getRam().verificar();
		pb.getVentilador().verificar();
		pb.getDduro().verificar();
		pb.getRam().encender();
		pb.getVentilador().encender();
		pb.getDduro().encender();
	}

	private List<Particion> buscarParticionArranque() {
		System.out.println("Buscando las particiones de arranque");
		List<Particion> particionesArranque = new ArrayList<>();
		for (Particion particion : pb.getDduro().getParticiones()) {
			if (particion.isArranque())
				particionesArranque.add(particion);
		}
		return particionesArranque;
	}

	public void ejecutarBootstrap() {
		System.out.println("Ejecutando el bootstrap");
		bootstrap.setParticionesArranque(buscarParticionArranque());
		// Podemos mostrar un menú aqui para que el usuario seleccione la particion que
		// desee
		bootstrap.seleccionarSistemaOperativo((byte) 0);
	}
	
	public void cargarSistemaOperativo() {
		pb.getRam().cargarSoftware(bootstrap.getSoseleccionado());
	}
}
