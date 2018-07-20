package iterator;

public class Main {

	public static void main(String[] args) {
		Proveedor p1 = new Proveedor1();
		Proveedor p2 = new Proveedor2();
		
		Cliente cliente = new Cliente(p1, p2);
		cliente.revisarMercancía();
	}

}
