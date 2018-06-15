package observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher{

	List<PublishListener> publishListeners;
	
	public Publisher() {
		publishListeners = new ArrayList<>();
	}
	
	void addPublishListener(PublishListener pl){
		publishListeners.add(pl);
	}
	
	void removePublishListener(PublishListener pl){
		publishListeners.remove(pl);
	}
	
	void notifyPublication(Publication p){
		for (PublishListener publishListener : publishListeners) {
			publishListener.getRelease(p);
		}
	}
}
