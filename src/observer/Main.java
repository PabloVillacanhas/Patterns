package observer;

/*
 * La clase Publisher notifica los cambios a los elementos que implementen PublishListener
 * y les envia una publicación que extiende Publication para que la lean.
 */
public class Main {

	public static void main(String... args) {
		//Publication
		Newspaper newspaper = new Newspaper("The times", 60, "Thing are happening");
		Magazine magazine = new Magazine("Programming Java", 39, "The observer pattern example");
		
		//PublishListeners
		Enterprise enterprise = new Enterprise("Code.SA");
		Person person = new Person("Peter");
		Enterprise enterprise2 = new Enterprise("Zen.inc");
		
		//Añadimos dos oyentes al Publisher
		Publisher publisher = new Publisher();
		publisher.addPublishListener(enterprise);
		publisher.addPublishListener(enterprise2);
		publisher.notifyPublication(newspaper); //notificamos la publicación
		
		//Quitamos un oyente y ponemos otro
		publisher.addPublishListener(person);
		publisher.removePublishListener(enterprise2);
		publisher.notifyPublication(magazine); //notificamos la publicación
	}
}
