public class EmailNotificationListener implements EventListener {

    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(Genre genre, EventDetail eventDetail) {
        System.out.println("Email to " + email + ", Genre: " + genre + ", Event Details: " + eventDetail);
    }
}