import java.math.BigDecimal;

public class Pizza extends Meal {

    public Pizza(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void printMealInformation() {
        System.out.println("Pizza[name:" + name + ", price:" + price + "]");
    }

    @Override
    public void eat() {
        System.out.println(name + " which price is " + price + " was eaten");
    }
}