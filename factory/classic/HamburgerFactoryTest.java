import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class HamburgerFactoryTest {

	@Test
	public void when_makeCheeseburgerFromHamburgerFactory_expect_successMakeProcess() {
		// Given
		Hamburger cheeseburger = HamburgerFactory.getHamburger("Cheeseburger");
		 
		// When 
		boolean actual = cheeseburger.make();
		
		// Then
		assertTrue(actual);
	}
}