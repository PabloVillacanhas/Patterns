package singleton;

public class Main {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				MiSingleton ms = MiSingleton.getInstance();
				ms.changeValue("Valor dado por el hilo 1");
			}
		};
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				MiSingleton ms = MiSingleton.getInstance();
				ms.changeValue("Valor dado por el hilo 2");
			}
		};
		
		System.out.println(MiSingleton.getInstance().toString());
		r1.run();
		System.out.println(MiSingleton.getInstance().toString());
		r2.run();
		System.out.println(MiSingleton.getInstance().toString());
	}

}
