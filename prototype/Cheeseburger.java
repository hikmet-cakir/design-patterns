import java.math.BigDecimal;

public class Cheeseburger implements Hamburger {

    private BigDecimal price;

    public Cheeseburger(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public Hamburger clone() {
        return new Cheeseburger(price);
    }

    @Override
    public String toString() {
        return "Cheeseburger{" +
                "price=" + price +
                '}';
    }
}
