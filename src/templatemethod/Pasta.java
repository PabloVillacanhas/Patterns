package templatemethod;

public abstract class Pasta {
	
	public void preparar() {
		hervirAgua();
		echarSal();
		cocer();
		condimentar();
	}

	public void hervirAgua() {
		System.out.println("Hirviendo agua...");
	}
	
	public void echarSal() {
		System.out.println("Echando sal...");
	}
	
	protected abstract void cocer();
	
	protected abstract void condimentar();
}
