package singleton;

public final class MiSingleton {

	int valor = 0;
	private static MiSingleton miSingleton = new MiSingleton();

	public MiSingleton() {}

	public static synchronized MiSingleton getInstance() {
		return miSingleton;
	}

	public synchronized int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public synchronized void setValorPlusOne() {
		System.out.print("Se ha cogido el valor " + getValor());
		setValor(getValor() + 1);
		System.out.print(" y se ha sumado 1 hasta " + getValor());
		System.out.println();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}

	@Override
	public String toString() {
		return "MiSingleton [valor=" + valor + "]";
	}
}
