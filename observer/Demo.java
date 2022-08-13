import java.math.BigDecimal;

import java.time.LocalDateTime;

public class Demo {

    public static void main(String[] args) {
        TicketSeller salesman = new TicketSeller(Genre.BLUES, Genre.JAZZ, Genre.ELECTRONIC);
        salesman.events.subscribe(Genre.BLUES, new SmsNotificationListener("+99 999 999 99 99"));
        salesman.events.subscribe(Genre.JAZZ, new SmsNotificationListener("+88 888 888 88 88"));
        salesman.events.subscribe(Genre.ELECTRONIC, new EmailNotificationListener("customer@ticket.com"));

        salesman.notifyEvent(Genre.BLUES, new EventDetail("Robert Johnson", BigDecimal.TEN, LocalDateTime.now()));
        salesman.notifyEvent(Genre.JAZZ, new EventDetail("Louis Armstrong", BigDecimal.TEN, LocalDateTime.now()));
        salesman.notifyEvent(Genre.ELECTRONIC, new EventDetail("Swedish House Mafia", BigDecimal.TEN, LocalDateTime.now()));
    }
}