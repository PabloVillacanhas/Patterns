package composite;

public class Ciudad implements Territorio {

	String nombre;
	int poblacion;

	public Ciudad(String nombre, int poblacion) {
		this.nombre = nombre;
		this.poblacion = poblacion;
	}

	@Override
	public int getPoblacion() {
		return poblacion;
	}

}
