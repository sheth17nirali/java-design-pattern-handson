
public abstract class Factory {
	abstract Headlight makeHeadlight();
	abstract Tire makeTire();
	
	public static Factory getFactory(String s) {
		if(s.equalsIgnoreCase("Mercedes")) {
			return new MercedesFactory();
		}
		else if(s.equalsIgnoreCase("Audi")){
			return new AudiFactory();
		}
		else{
			System.out.println("Invalid");
			System.exit(0);
			return null;
		}
	}
}
