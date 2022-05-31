public class App {

    public static void main(String[] args) {
        Chef italianChef = new ItalianChef();
        Food pizza = italianChef.make(FoodType.PIZZA);
        System.out.println(pizza);

        Chef turkishChef = new TurkeyChef();
        Food kebab = turkishChef.make(FoodType.KEBAB);
        System.out.println(kebab); 
    }
}