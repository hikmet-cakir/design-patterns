public class Demo {

    public static void main(String[] args) {
        // Margherita Pizza Preparing Process
        Chef pizzaChef = new PizzaChef();
        Restaurant restaurant = new Kitchen(pizzaChef);

        Meal margherita = restaurant.makeIt("Margherita");
        System.out.println(margherita);
    }
}