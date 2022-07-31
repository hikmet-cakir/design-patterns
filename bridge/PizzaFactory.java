public class PizzaFactory {

    public static Meal getPizzaMaterials(String pizzaType) throws UnsupportedOperationException {
        switch(pizzaType) {
            case "Pepperoni" :
                return Meal.PEPPERONIPIZZA;
            case "Margherita" :
                return Meal.MARGHERITAPIZZA;
            case "Veggie" :
                return Meal.VEGGIEPIZZA;
            default :
                System.err.println("Doesn't Match!");
        }
        throw new UnsupportedOperationException("Unsupported Pizza Type:" + pizzaType);
    }
}