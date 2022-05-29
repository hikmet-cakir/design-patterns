public class Cheeseburger implements Hamburger {

	@Override
	public boolean make() {
		System.out.println("Cheeseburger made...");
		return true;
	}
}