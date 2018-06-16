package decorator;

public class Main {
	public static void main(String... args) {

		Comida comida = new MasaPizza();
		comida = new QuesoRallado(comida);
		comida = new SalsaTomate(comida);
		comida = new Carne(comida);
		System.out.println(comida.getPrecio());
		System.out.println(comida);
	}
}