package singleton;

public final class MiSingleton {

	String valor;
	private static MiSingleton miSingleton = new MiSingleton();
	
	public MiSingleton(){
		valor = "Valor Inicial";
	}
	
	public static synchronized MiSingleton getInstance() {
		return miSingleton;
	}
	
	public void changeValue(String valor) {
		this.valor = valor;
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
