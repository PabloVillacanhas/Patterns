package facade;

public class Particion {

	private SistemaOperativo soperativo;

	public Particion() {
	}

	public Particion(SistemaOperativo sistemaOperativo) {
		this.soperativo = sistemaOperativo;
	}

	public boolean isArranque() {
		return (soperativo != null) ? true : false;
	}

	public SistemaOperativo getSistemOperativo() {
		return isArranque() ? soperativo : null;
	}
}
