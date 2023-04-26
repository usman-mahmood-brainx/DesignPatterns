// Observer interface
public interface Observer {
    void update(String videoTitle);
}

// Subject interface
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String videoTitle);
}

// Concrete Subject
public class YouTubeChannel implements Subject {
    private List<Observer> observers;
    private String latestVideoTitle;

    public YouTubeChannel() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String videoTitle) {
        for (Observer observer : observers) {
            observer.update(videoTitle);
        }
    }

    public void uploadVideo(String videoTitle) {
        latestVideoTitle = videoTitle;
        notifyObservers(videoTitle);
    }
}

// Concrete Observer
public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String videoTitle) {
        System.out.println(name + " received a notification: " + videoTitle);
    }
}





class ObserverPattern{
	public static void main(String args[]){
		YouTubeChannel myChannel = new YouTubeChannel();

		Subscriber subscriber1 = new Subscriber("Alice");
		Subscriber subscriber2 = new Subscriber("Bob");

		myChannel.registerObserver(subscriber1);
		myChannel.registerObserver(subscriber2);

		// Later on, when a new video is uploaded
		myChannel.uploadVideo("New Video Title");

	}
}

