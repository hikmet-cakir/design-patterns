import org.junit.Assert;
import org.junit.Test;

public class BurgerRestaurantTest {

    @Test
    public void when_takesCheeseburgerMultipleTimes_expect_differentObjects() {
        BurgerRestaurant burgerRestaurant = new BurgerRestaurant();
        Hamburger chicken1 = burgerRestaurant.getHamburgerByHamburgerType("chicken");
        Hamburger chicken2 = burgerRestaurant.getHamburgerByHamburgerType("chicken");

        boolean isEqual = chicken1 == chicken2;
        Assert.assertFalse(isEqual);
    }
}