
public class TicketSeller {

    public EventManager events;

    public TicketSeller(Genre... genres) {
        this.events = new EventManager(genres);
    }

    public void notifyEvent(Genre genre, EventDetail eventDetail) {
        events.notify(genre, eventDetail);
    }
}