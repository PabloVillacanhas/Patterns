package facade;

public class SistemaOperativo implements Software {

	private String nombre;

	public SistemaOperativo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void gestionMemoria() {
		System.out.println("Gestionando memoria");
	}

	public void gestionProcesos() {
		System.out.println("Gestionando procesos");
	}

	public void apagar() {
		System.out.println("Cerrando procesos y apagando");
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}
