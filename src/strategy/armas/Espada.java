package strategy.armas;

import strategy.personajes.Personaje;

public class Espada implements ArmaGuerrero {

	@Override
	public void golpear(Personaje p) {
		p.setSalud(p.getSalud() - 50);

	}

}
