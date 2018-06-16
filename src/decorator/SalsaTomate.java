package decorator;

public class SalsaTomate extends ComidaDecorator {

	public SalsaTomate(Comida comida) {
		super(comida);
		setNombre("salsa de tomate");
	}

	@Override
	public double getPrecio() {
		return 0.5 + super.getPrecio();
	}

	@Override
	public void setPrecio(double precio) {
		super.setPrecio(precio);
	}

}
