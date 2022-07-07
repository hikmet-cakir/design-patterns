import java.util.List;

import static java.util.Arrays.asList;

public class HamburgerFactory {

    public static List<Food> getHamburgerMaterials(String hamburgerType) throws UnsupportedOperationException {
        switch(hamburgerType) {
            case "Cheeseburger" :
                return asList(Food.CHEESE, Food.MEATBALL, Food.BREAD, Food.SALT, Food.TOMATO, Food.LETTUCE, Food.ONION);
            case "Mexicanoburger" :
                return asList(Food.HOT_SAUCE, Food.MEATBALL, Food.BREAD, Food.SALT, Food.TOMATO, Food.LETTUCE, Food.ONION);
            case "Mushroomburger" :
                return asList(Food.MUSHROOM, Food.MEATBALL, Food.BREAD, Food.SALT, Food.TOMATO, Food.LETTUCE, Food.ONION);
            default :
                System.err.println("Doesn't Match!");
        }
        throw new UnsupportedOperationException("Unsupported Burger Type:" + hamburgerType);
    }
}