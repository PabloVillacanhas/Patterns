package decorator;

public abstract class ComidaDecorator extends Comida {

	Comida comida;

	public ComidaDecorator(Comida comida) {
		this.comida = comida;
	}

	public ComidaDecorator(String nombre, double precio) {
		super(nombre, precio);
	}

	@Override
	public double getPrecio() {
		return precio + comida.getPrecio();
	}

	@Override
	public String toString() {
		return comida.toString() + "con " + nombre + " ";
	}

}
