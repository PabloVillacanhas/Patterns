package strategy.personajes;

import strategy.armas.ArmaGuerrero;

public class Guerrero extends Personaje{

	private ArmaGuerrero armaGuerrero;

	public Guerrero(ArmaGuerrero armaGuerrero) {
		super();
		this.armaGuerrero = armaGuerrero;
	}

	public ArmaGuerrero getArmaGuerrero() {
		return armaGuerrero;
	}

	public void setArmaGuerrero(ArmaGuerrero armaGuerrero) {
		this.armaGuerrero = armaGuerrero;
	}

}
