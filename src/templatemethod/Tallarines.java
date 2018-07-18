package templatemethod;

public class Tallarines extends Pasta {

	public Tallarines() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void cocer() {
		System.out.println("Cociendo 13 minutos");
	}

	@Override
	protected void condimentar() {
		System.out.println("Condimentado con romero");
	}

}
