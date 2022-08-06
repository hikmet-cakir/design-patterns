import java.math.BigDecimal;

public class Hamburger extends Meal {

    public Hamburger(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void printMealInformation() {
        System.out.println("Hamburger[name:" + name + ", price:" + price + "]");
    }

    @Override
    public void eat() {
        System.out.println(name + " which price is " + price + " was eaten");
    }
}