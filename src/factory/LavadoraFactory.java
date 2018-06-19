package factory;

public class LavadoraFactory extends ElectrodomesticoFactory {

	@Override
	public Electrodomestico create(String nombre, double precio) {
		return new Lavadora(nombre, precio);
	}

}
