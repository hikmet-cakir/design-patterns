import java.math.BigDecimal;
import java.util.Map;
import java.util.HashMap;

public class BurgerRestaurant {
    private static final Map<String, Hamburger> hamburgerByHamburgerName = new HashMap<>();

    static {
        hamburgerByHamburgerName.put("chicken", new Chickenburger(new BigDecimal("13.20")));
        hamburgerByHamburgerName.put("cheeseburger", new Cheeseburger(new BigDecimal("11.50")));
        hamburgerByHamburgerName.put("onion", new Onionburger(new BigDecimal("14.00")));
    }

    public static Hamburger getHamburgerByHamburgerType(String hamburgerType) {
        try {
            return hamburgerByHamburgerName.get(hamburgerType).clone();
        } catch (Exception e) {
            System.out.println("Something Went Wrong!");
            return null;
        }
    }
}
