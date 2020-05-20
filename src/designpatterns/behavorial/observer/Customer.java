package designpatterns.behavorial.observer;

public class Customer implements Observer {

	private String location;

	@Override
	public void update(String location) {
		this.location = location;
		showLocation();
	}

	public void showLocation() {
		System.out.println("Notification at Customer - Current Location: " + location);
	}

}
