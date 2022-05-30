public class HamburgerFactory {
	
	public static Hamburger getHamburger(String hamburgerType) {
		switch(hamburgerType) {
			case "Cheeseburger" : return new Cheeseburger();
			case "Chickenburger" : return new Chickenburger();
			case "Mexicanoburger" : return new Mexicanoburger();
		}
		
		throw new UnsupportedOperationException("Unsupported Burger Type:" + hamburgerType);
	}
}
