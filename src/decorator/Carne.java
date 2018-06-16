package decorator;

public class Carne extends ComidaDecorator {

	public Carne(Comida comida) {
		super(comida);
		setNombre("carne");
	}

	@Override
	public double getPrecio() {
		return 3.5 + super.getPrecio();
	}

	@Override
	public void setPrecio(double precio) {
		super.setPrecio(precio);
	}
}
