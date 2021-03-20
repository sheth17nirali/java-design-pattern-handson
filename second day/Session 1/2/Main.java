
public class Main {
	public static void main(String[] args) {
		whenConvertingMPHToKMPH_thenSuccessfullyConverted();
		whenConvertingUSDToEURO_thenSuccessfullyConverted();
	}

//	@Test 
	public static void whenConvertingMPHToKMPH_thenSuccessfullyConverted() { 
		Movable bugattiVeyron = new BugattiVeyron(); 
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
//assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001); 
		if(bugattiVeyronAdapter.getSpeed() == 431.30312) {
			System.out.println("Speed Converted!");
		}
		else {System.out.println("false");}
	}
	
	public static void whenConvertingUSDToEURO_thenSuccessfullyConverted() { 
		Movable bugattiVeyron = new BugattiVeyron(); 
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		
		if(bugattiVeyronAdapter.getPrice() == 8375000.0) {
			System.out.println("Price Converted!");
		}
		else {System.out.println("false");}
	}
}
