import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    Map<Genre, List<EventListener>> listeners = new HashMap<>();

    public EventManager(Genre... genres) {
        for (Genre genre : genres) {
            this.listeners.put(genre, new ArrayList<>());
        }
    }

    public void subscribe(Genre genre, EventListener listener) {
        List<EventListener> users = listeners.get(genre);
        users.add(listener);
    }

    public void unsubscribe(Genre genre, EventListener listener) {
        List<EventListener> users = listeners.get(genre);
        users.remove(listener);
    }

    public void notify(Genre genre, EventDetail eventDetail) {
        List<EventListener> users = listeners.get(genre);
        for (EventListener listener : users) {
            listener.update(genre, eventDetail);
        }
    }
}