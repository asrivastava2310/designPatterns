package designpatterns.behavorial.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		DeliveryDataRepo observable = new DeliveryDataRepo();
		Observer seller = new Seller();
		Observer customer = new Customer();
	    Observer deliveryWarehouseCenter = new DeliveryWarehouseCenter();
	    
	    //Register observers to observable
	    observable.register(seller);
	    observable.register(customer);
	    observable.register(deliveryWarehouseCenter);
	    
	    //make a change
	    observable.updateLocation("New York");
	    
	    //unregister any observer
	    System.out.println("\nUnregistering Seller");
	    observable.unregister(seller);
	    
	    //make a change again
	    observable.updateLocation("Chicago");
	    
	}

}
