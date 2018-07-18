package templatemethod;

public class Main {

	public static void main(String[] args) {
		PastaHook ph = new TallarinesHook();
		ph.preparar();

		Pasta p = new Tallarines();
		p.preparar();
	}

}
