import java.math.BigDecimal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventDetail {

    private String musician;
    private BigDecimal price;
    private LocalDateTime startTime;

    public EventDetail(String musician, BigDecimal price, LocalDateTime startTime) {
        this.musician = musician;
        this.price = price;
        this.startTime = startTime;
    }

    public String getMusician() {
        return musician;
    }

    public void setMusician(String musician) {
        this.musician = musician;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Musician=" + musician + ", Price=" + price + ", Start Time=" + startTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }
}
