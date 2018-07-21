package composite;

public class Main {

	public static void main(String[] args) {
		Continente europa = new Continente("Europa");
		Pais espana = new Pais("España");
		Ciudad ciudad1 = new Ciudad("Madrid", 2000);
		Ciudad ciudad2 = new Ciudad("Barelona", 3000);
		Pais francia = new Pais("Francia");
		Ciudad ciudad3 = new Ciudad("Burdeos", 1000);
		europa.addTerritorio(espana);
		europa.addTerritorio(francia);
		espana.addTerritorio(ciudad1);
		espana.addTerritorio(ciudad2);
		francia.addTerritorio(ciudad3);
		System.out.println(europa.getPoblacion());
		System.out.println(espana.getPoblacion());
		System.out.println(francia.getPoblacion());
	}

}
