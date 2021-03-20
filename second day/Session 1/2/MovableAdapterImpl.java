public class MovableAdapterImpl implements MovableAdapter { 
	
	private Movable luxuryCars;
	
	public MovableAdapterImpl(Movable luxuryCars) {
		this.luxuryCars = luxuryCars;
		// TODO Auto-generated constructor stub
	}
	// standard constructors 
	@Override
	public double getSpeed() { 
		return convertMPHtoKMPH(luxuryCars.getSpeed()); 
	} 
	
	private double convertMPHtoKMPH(double mph) { 
		return mph * 1.60934; 
	} 
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return convertUSDtoEURO(luxuryCars.getPrice());
	}
	
	private double convertUSDtoEURO(double usd) { 
		return usd*0.8375; 
	}
}