package facade;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Instanciamos los componentes necesarios
		AlimentadorCorriente acorriente = new AlimentadorCorriente();
		ArrayList<Particion> particiones = new ArrayList<>();
		particiones.add(new Particion(new SistemaOperativo("Debian 9.0")));
		particiones.add(new Particion());
		DiscoDuro discoDuro = new DiscoDuro(particiones);
		PlacaBase placaBase = new PlacaBase(new Ventilador(), new RAM(), discoDuro);
		FirmwareMotherboard firmwareMotherboard = new FirmwareMotherboard(new Bootstrap(), placaBase);
		TurnOnnOffComputerFacade toc = new TurnOnnOffComputerFacade(acorriente, firmwareMotherboard);

		//Ejecutamos el encendido
		toc.encenderOrdenador();
	}
}
