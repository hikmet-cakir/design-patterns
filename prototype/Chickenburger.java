import java.math.BigDecimal;

public class Chickenburger implements Hamburger {

    private BigDecimal price;

    public Chickenburger(BigDecimal price) {
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
        return new Chickenburger(price);
    }

    @Override
    public String toString() {
        return "Chickenburger{" +
                "price=" + price +
                '}';
    }
}