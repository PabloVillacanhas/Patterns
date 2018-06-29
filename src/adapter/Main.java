package adapter;

public class Main {

	public static void main (String... args) {
		//Creamos las instancias de nuestros objetos
		Aeropuerto aeropuerto = new Aeropuerto();
		Helicoptero h = new Helicoptero();
		Avion a = new AvionConcreto();
		
		//Insertamos nuestro helicoptero en un adaptador
		AvionAdapter adapter = new AvionAdapter(h);
		
		//Ahora podemos insertar nuestros objetos en la lista
		aeropuerto.addAvion(a);
		aeropuerto.addAvion(adapter);
		
		for(Avion avion: aeropuerto.getAviones()){
			avion.aterrizar();
		}
	}
}
