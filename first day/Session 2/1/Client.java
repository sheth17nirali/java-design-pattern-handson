import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the brand name:");
		String brand = input.next();
		Factory factory = Factory.getFactory(brand);
		factory.makeHeadlight();
		factory.makeTire();
		input.close();
	}
}
