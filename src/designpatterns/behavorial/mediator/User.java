package designpatterns.behavorial.mediator;

import java.util.List;

//Colleague Class
public abstract class User {
	protected ChatRoomMediator mediator;
	protected String userId;
	protected String name;

	public User(ChatRoomMediator mediator, String userId, String name) {
		this.mediator = mediator;
		this.userId = userId;
		this.name = name;
	}

	public abstract void sendPrivate(String message, User user);
	
	public abstract void sendToAll(String message, List<User> users);

	public abstract void receive(String message);

	public ChatRoomMediator getMediator() {
		return mediator;
	}

	public String getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}
}
