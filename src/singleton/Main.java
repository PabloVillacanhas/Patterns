package singleton;

public class Main {

	// Creamos dos hilos que aumentan en uno el valos de una variable estática de un
	// Singleton.
	// Vemos como la operacion de suma se realiza siempre sobre la misma instancia.
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				while (MiSingleton.getInstance().getValor() < 50) {
					MiSingleton ms = MiSingleton.getInstance();
					ms.setValorPlusOne();
				}
			}
		};

		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				while (MiSingleton.getInstance().getValor() < 50) {
					MiSingleton ms = MiSingleton.getInstance();
					ms.setValorPlusOne();
				}
			}
		};

		new Thread(r1).start();
		new Thread(r2).start();
	}
}
