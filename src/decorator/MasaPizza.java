package decorator;

public class MasaPizza extends Comida {

	@Override
	public double getPrecio() {
		return 1;
	}

	@Override
	public void setPrecio(double precio) {
		super.setPrecio(precio);
	}

	@Override
	public String toString() {
		return "Masa de pizza ";
	}
}
