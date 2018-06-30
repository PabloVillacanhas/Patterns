package facade;

import java.util.ArrayList;
import java.util.List;

public class Bootstrap {

	private List<Particion> particionesArranque = new ArrayList<>();
	private SistemaOperativo soseleccionado;
	
	public void setParticionesArranque(List<Particion> particionesArranque) {
		this.particionesArranque = particionesArranque;
	}
	
	public void addParticionArranque(Particion p) {
		particionesArranque.add(p);
	}
	
	public void seleccionarSistemaOperativo(byte opcion) {
		System.out.println("Seleccionando el sistema operativo");
		soseleccionado = particionesArranque.get(opcion).getSistemOperativo();
	}

	public SistemaOperativo getSoseleccionado() {
		return soseleccionado;
	}

	public void setSoseleccionado(SistemaOperativo soseleccionado) {
		this.soseleccionado = soseleccionado;
	}
}
