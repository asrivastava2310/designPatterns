package designpatterns.behavorial.observer;

import java.util.ArrayList;
import java.util.List;

public class DeliveryDataRepo implements Subject {
	private List<Observer> observers;
	private String location;

	public DeliveryDataRepo() {
		this.observers = new ArrayList<>();
		this.location = "At Inventory for quality cheecks";
		System.out.println("Location is Inventory");
	}

	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update(location);
		}
	}

	// a property change will trigger notifyObservers()
	public void updateLocation(String newLocation) {
		this.location = newLocation;
		System.out.println("\nLocation updated to " + location);
		notifyObservers();
	}

	public String getLocation() {
		return location;
	}

}
