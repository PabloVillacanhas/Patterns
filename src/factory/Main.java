package factory;

/*
 * Este ejemplo está hecho con el patrón Method Factory, es decir
 * cada clase concreta tiene un creador concreto que hereda de ElectrodomesticoFactory
 */
public class Main {

	public static void main(String[] args) {
		ElectrodomesticoFactory eFactory = new NeveraFactory();
		Electrodomestico nevera = eFactory.create("Nevera 2000", 300.53);
		System.out.println(nevera);
		eFactory = new MicroondasFactory();
		Electrodomestico microondas = eFactory.create("Microondas 250W", 70);
		System.out.println(microondas);
	}
}
