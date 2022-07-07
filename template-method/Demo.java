public class Demo {
    
    public static void main(String[] args) {
        String hamburger = "Cheeseburger";
        Maker hamburgerMaker = new HamburgerMaker(hamburger);
        hamburgerMaker.make();

        System.out.println();

        String pizza = "Margherita";
        Maker pizzaMaker = new PizzaMaker(pizza);
        pizzaMaker.make();
    }
}