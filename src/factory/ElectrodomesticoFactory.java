package factory;

public abstract class ElectrodomesticoFactory {
	
	public abstract Electrodomestico create( String nombre, double precio);
}
