package templatemethod;

public abstract class PastaHook extends Pasta {

	public void preparar() {
		hervirAgua();
		echarSal();
		cocer();
		if (isCondimentado()) {
			condimentar();

		}
	}

	public void hervirAgua() {
		System.out.println("Hirviendo agua...");
	}
	
	public void echarSal() {
		System.out.println("Echando sal...");
	}
	
	protected abstract void cocer();
	
	protected abstract void condimentar();
	
	protected boolean isCondimentado() {
		return true;
	}
}
