package strategy.armas;

import strategy.personajes.Personaje;

public class Varita implements ArmaMago {

	@Override
	public void golpear(Personaje p) {
		p.setSalud(p.getSalud() - 30);
	}

}
