package designpatterns.behavorial.mediator;

//Mediator Interface
public interface ChatRoomMediator {

	public void sendPrivateMessage(String message, User user);

	void addUser(User user);
}
