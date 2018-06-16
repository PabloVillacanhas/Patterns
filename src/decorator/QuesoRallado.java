package decorator;

public class QuesoRallado extends ComidaDecorator {

	public QuesoRallado(Comida comida) {
		super(comida);
		setNombre("queso");
	}

	@Override
	public double getPrecio() {
		return 1.25 + super.getPrecio();
	}

	@Override
	public void setPrecio(double precio) {
		super.setPrecio(precio);
	}

}
