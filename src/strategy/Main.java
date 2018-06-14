package strategy;

import strategy.armas.Espada;
import strategy.armas.Hacha;
import strategy.armas.Piromancia;
import strategy.armas.Varita;
import strategy.personajes.Guerrero;
import strategy.personajes.Mago;

public class Main {

	public static void main(String[] args) {
		Varita varita = new Varita();
		Hacha hacha = new Hacha();
		Espada espada = new Espada();
		Piromancia piromancia = new Piromancia();

		Mago mago = new Mago(varita);
		Guerrero guerrero = new Guerrero(espada);
		
		int ronda = 0;
		while (mago.getSalud() > 0 && guerrero.getSalud() > 0) {
			ronda++;
			System.out.println("Ronda " + ronda);
			
			//Los personajes cambian de arma si su salud baja de 50 puntos
			if (mago.getSalud() <= 50)
				mago.setArmaMago(piromancia);
			if (guerrero.getSalud() <= 50)
				guerrero.setArmaGuerrero(hacha);
			
			//Fase de combate
			mago.getArmaMago().golpear(guerrero);
			guerrero.getArmaGuerrero().golpear(mago);
			System.out.println("Salud de mago: " + mago.getSalud());
			System.out.println("Salud de guerrero: " + guerrero.getSalud());
		}
		
		if(mago.getSalud()<=0)
			System.out.println("El guerrero ha ganado");
		else
			System.out.println("El mago ha ganado");
	}
}
