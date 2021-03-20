import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator{
//	IUser user;
	List<IUser> users;
	
	public ChatMediator() {
		users = new ArrayList<>();
//		this.user = user;
	}
	
	@Override
	public void AddUser(IUser u) {
		users.add(u);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void SendMessage(String s) {
		// TODO Auto-generated method stub
		for(IUser user : users) {
//			u.SendMessage(s);
			user.ReceiveMessage(s);
		}
	}
	
}