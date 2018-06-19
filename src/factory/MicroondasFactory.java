package factory;

public class MicroondasFactory extends ElectrodomesticoFactory {

	@Override
	public Electrodomestico create(String nombre, double precio) {
		return new Microondas(nombre, precio);
	}

}
