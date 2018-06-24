package command;

public class Main {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta(1000);
		SacarDineroCommand command = new SacarDineroCommand(c1, 500);
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.performCommand();
		System.out.println(c1.getDinero());

		//Mismo código que el expuesto arriba pero realizado con expresión lambda
		//Nótese que no haría falta la creacion del código fuente de la clase del comando.
		Cuenta c2 = new Cuenta(1000);
		invoker.setCommand(() -> c2.setDinero(c2.getDinero()-500));
		invoker.performCommand();
		System.out.println(c2.getDinero());
	}
}

