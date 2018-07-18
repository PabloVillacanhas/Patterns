package templatemethod;

public class Macarrones extends Pasta {

	public Macarrones() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void cocer() {
		System.out.println("Cociendo 12 minutos");
	}

	@Override
	protected void condimentar() {
		System.out.println("Condimentando con laurel");

	}

}
