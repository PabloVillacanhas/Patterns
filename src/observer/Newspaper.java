package observer;

public class Newspaper extends Publication{

	String titular;
	
	public Newspaper(String title, int num_pages, String titular) {
		super(title, num_pages);
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "el periodico " + getTitle();
	}
}

