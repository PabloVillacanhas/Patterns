package templatemethod;

public class Espaguetis extends Pasta {

	public Espaguetis() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void cocer() {
		System.out.println("Cociendo 10 minutos");
	}

	@Override
	protected void condimentar() {
		System.out.println("Condimentando con tomillo");
	}

}
