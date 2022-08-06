import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        Meal mexicanoBurger = new Hamburger("Mexicano", BigDecimal.valueOf(45.50D));
        mexicanoBurger.eat();
        Meal onionBurger = new Hamburger("Onion", BigDecimal.valueOf(35.25D));
        onionBurger.eat();

        Meal margherita = new Pizza("Margherita", BigDecimal.valueOf(50.75D));
        margherita.eat();
        Meal pepperoni = new Pizza("Pepperoni", BigDecimal.valueOf(40.75D));
        pepperoni.eat();

        Package meals = new Package();
        meals.addMeal(mexicanoBurger);
        meals.addMeal(onionBurger);
        meals.addMeal(margherita);
        meals.addMeal(pepperoni);
        meals.eat();
    }
}