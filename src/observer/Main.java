package observer;

class Caja{
	private int valor;

	public int getValor(){
		return valor;
	}
	
	public void setValor(int num) {
		valor = num;
	}
}
public class Main {

	public static void main(String... args) {
		Caja x = new Caja();
		x.setValor(7);
		
		Caja y = x;
		y.setValor(11);
		
		System.out.println(x.getValor());
		System.out.println(y.getValor());
	}
}
