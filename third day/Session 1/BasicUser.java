
public class BasicUser implements IUser{

	ChatMediator cm;
	String name;
	String msg = "";
	
	BasicUser(String name){
		this.cm = new ChatMediator();
		this.name = name;
	}

	@Override
	public void ReceiveMessage(String s) {
		System.out.println("Name: "+ this.name);
		this.msg = s;
		System.out.println("Message: "+ s);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SendMessage(String s, IChatMediator c) {
		c.SendMessage(this.name+": "+s);
//		this.msg = s;
		// TODO Auto-generated method stub
		
	}
	
	
	

}
