package adapter;

public class AvionAdapter extends Avion {
	Helicoptero helicop;

	public AvionAdapter(Helicoptero helicop) {
		super();
		this.helicop = helicop;
	}

	@Override
	void acelerar() {
		helicop.desplazar();
	}

	@Override
	void frenar() {
		helicop.desplazar();

	}

	@Override
	void girar() {
		helicop.girar();
	}

	@Override
	void depegar() {
		helicop.elevar();
	}

	@Override
	void aterrizar() {
		helicop.posar();
	}

}
