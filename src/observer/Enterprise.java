package observer;

public class Enterprise implements PublishListener{

	String nombre;
	
	public Enterprise(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void getRelease(Publication p) {
		System.out.println(getNombre() + " ha recibido: " + p.toString());	}
}
