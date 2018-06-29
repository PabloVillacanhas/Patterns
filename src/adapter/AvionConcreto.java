package adapter;

public class AvionConcreto extends Avion {

	@Override
	void acelerar() {
		System.out.println("El avion está acelerando");
	}

	@Override
	void frenar() {
		System.out.println("El avion está frenando");
	}

	@Override
	void girar() {
		System.out.println("El avion está girando");
	}

	@Override
	void depegar() {
		System.out.println("El avion está despegando");
	}

	@Override
	void aterrizar() {
		System.out.println("El avion está aterrizando");
	}

}
