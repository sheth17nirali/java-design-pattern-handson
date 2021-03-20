import java.util.Scanner;

public class clientMain {
	public static void main(String[] args) {
		PhoneRepair phoneRepair = new PhoneRepair();
		AccessoryRepair accessoryRepair = new AccessoryRepair();
		Order order = new Order();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to our site, Would you like to order or repair?");
		String processOption = input.nextLine().toLowerCase().trim();
		String productDetail = "";
		
		switch(processOption) {
			case "order":
				System.out.println("Please provide the phone model name");
				productDetail = input.nextLine().trim();
				order.orderProcess(productDetail);
				break;
				
			case "repair":
				System.out.println("Is it the phone or the accessory that you want to be repaired");
				String productType = input.nextLine().toLowerCase();
				if(productType.equals("phone"))
				{
					System.out.println("Please provide the phone model name");
					productDetail = input.nextLine().trim();
					phoneRepair.phoneRepairProcess(productDetail);
				}
				else
				{
					System.out.println("Please provide the accessory detail, like headphone, tempered glass");
					productDetail = input.nextLine().trim();
					accessoryRepair.accessoryRepairProcess(productDetail);
				}
				break;
			
			default: break;
					
		}
		input.close();
	}
}
