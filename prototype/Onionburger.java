import java.math.BigDecimal;

public class Onionburger implements Hamburger {

    private BigDecimal price;

    public Onionburger(BigDecimal price) {
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
        return new Onionburger(price);
    }

    @Override
    public String toString() {
        return "Onionburger{" +
                "price=" + price +
                '}';
    }
}
