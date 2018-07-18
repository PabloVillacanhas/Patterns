package templatemethod;

public class TallarinesHook extends PastaHook {

	public TallarinesHook() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void cocer() {
		System.out.println("Cociendo 13 minutos");
	}

	@Override
	protected void condimentar() {
		System.out.println("Consimentado con romero");
	}

	@Override
	protected boolean isCondimentado() {
		//Lo óptimo sería preguntar por pantalla y devolver true o false según la respuesta. Simplificamos este paso.
		return false;
	}
}
