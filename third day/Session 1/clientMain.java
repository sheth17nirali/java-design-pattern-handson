
public class clientMain {
	public static void main(String[] args) {
//		System.out.println("Hello");
		ChatMediator cm = new ChatMediator();
		cm.AddUser(new BasicUser("Ram"));
		cm.AddUser(new BasicUser("Laxman"));
		cm.AddUser(new PremiumUser("Sita"));
		PremiumUser pu = new PremiumUser("Ravan");
//		cm.AddUser(pu);
		pu.SendMessage("Mai Lanka mein hu", cm);
		
		PremiumUser pubrother = new PremiumUser("Vibhishan");
//		cm.AddUser(pu);
		pubrother.SendMessage("Mai bhi lanka mein hu", cm);
	}
}
