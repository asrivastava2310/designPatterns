package designpatterns.behavorial.mediator;

import java.util.List;

//Concrete colleague
public class ChatUser extends User {

	public ChatUser(ChatRoomMediator mediator, String userId, String name) {
		super(mediator, userId, name);
	}

	@Override
	public void sendPrivate(String message, User user) {
		System.out.println(this.name + " :: Sending Message : " + message);
		mediator.sendPrivateMessage(message, user);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name + " :: Received Message : " + msg);
	}

	@Override
	public void sendToAll(String message, List<User> users) {
		System.out.println(this.name + " :: Sending Message : " + message);
		for (User user : users) {
			if (user.getUserId() != this.getUserId()) { // exclude sender
				mediator.sendPrivateMessage(message, user);
			}
		}
	}

}
