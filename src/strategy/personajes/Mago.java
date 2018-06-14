package strategy.personajes;

import strategy.armas.ArmaMago;

public class Mago extends Personaje{

	private ArmaMago armaMago;

	public Mago(ArmaMago armaMago) {
		super();
		this.armaMago = armaMago;
	}

	public ArmaMago getArmaMago() {
		return armaMago;
	}

	public void setArmaMago(ArmaMago armaMago) {
		this.armaMago = armaMago;
	}
}
