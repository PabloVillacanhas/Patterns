package command;

/*
 * El comando tiene todo el código necesario para ejecutarse cuando sea preciso
 * Tiene una referencia al receptor y un código ejecutable que actúa sobre este.
 */
public class SacarDineroCommand implements Command{

	private Cuenta cuenta; //Receptor del comando
	private double dinero;
	
	public SacarDineroCommand(Cuenta cuenta, double dinero) {
		super();
		this.cuenta = cuenta;
		this.dinero = dinero;
	}

	public void execute(){
		cuenta.setDinero(cuenta.getDinero()-dinero);
	}
}
