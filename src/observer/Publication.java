package observer;

public abstract class Publication {

	private String title;
	private int num_pages;
	
	public Publication(String title, int num_pages) {
		super();
		this.title = title;
		this.num_pages = num_pages;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNum_pages() {
		return num_pages;
	}
	public void setNum_pages(int num_pages) {
		this.num_pages = num_pages;
	}
	
}
