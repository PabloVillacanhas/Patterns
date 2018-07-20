package iterator;

public class Prenda {

	private String prenda;

	public Prenda(String prenda) {
		super();
		this.prenda = prenda;
	}

	public String getPrenda() {
		return prenda;
	}

	public void setPrenda(String prenda) {
		this.prenda = prenda;
	}

	@Override
	public String toString() {
		return prenda;
	}
}
