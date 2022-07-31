public class Demo {
    public static void main(String[] args) {
        Salesman salesman = new Salesman();
        salesman.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        salesman.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            salesman.openFile("test.txt");
            salesman.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}