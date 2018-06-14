package strategy.armas;

import strategy.personajes.Personaje;

public class Piromancia implements ArmaMago {

	@Override
	public void golpear(Personaje p) {
		p.setSalud(p.getSalud() - 60);
	}
}
