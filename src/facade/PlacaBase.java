package facade;

public class PlacaBase {

	private Ventilador ventilador;
	private RAM ram;
	private DiscoDuro dduro;

	public PlacaBase(Ventilador ventilador, RAM ram, DiscoDuro dduro) {
		super();
		this.ventilador = ventilador;
		this.ram = ram;
		this.dduro = dduro;
	}

	public Ventilador getVentilador() {
		return ventilador;
	}

	public void setVentilador(Ventilador ventilador) {
		this.ventilador = ventilador;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public DiscoDuro getDduro() {
		return dduro;
	}

	public void setDduro(DiscoDuro dduro) {
		this.dduro = dduro;
	}
}
