package observer;

public class Magazine extends Publication {

	String tema;
	
	public Magazine(String title, int num_pages, String tema) {
		super(title, num_pages);
		this.tema = tema;
	}

	@Override
	public String toString() {
		return "la revista " + getTitle();
	}
}
