import java.util.List;

import static java.util.Arrays.asList;

public class PizzaFactory {

    public static List<Food> getPizzaMaterials(String pizzaType) throws UnsupportedOperationException {
        switch(pizzaType) {
            case "Pepperoni" :
                return asList(Food.CHEESE, Food.MEATBALL, Food.BREAD, Food.SALT, Food.TOMATO);
            case "Margherita" :
                return asList(Food.BREAD, Food.SALT, Food.TOMATO);
            case "Veggie" :
                return asList(Food.MUSHROOM, Food.BREAD, Food.SALT, Food.TOMATO);
            default :
                System.err.println("Doesn't Match!");
        }
        throw new UnsupportedOperationException("Unsupported Pizza Type:" + pizzaType);
    }
}
