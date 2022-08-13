public class SmsNotificationListener implements EventListener {

    private String phoneNumber;

    public SmsNotificationListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(Genre genre, EventDetail eventDetail) {
        System.out.println("Sms to " + phoneNumber + ", Genre: " + genre + ", Event Details: " + eventDetail);
    }
}