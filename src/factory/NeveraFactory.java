package factory;

public class NeveraFactory extends ElectrodomesticoFactory {

	@Override
	public Electrodomestico create(String nombre, double precio) {
		return new Nevera(nombre, precio);
	}

}
