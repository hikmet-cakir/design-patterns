import java.util.List;

public class PizzaMaker extends Maker {

    public PizzaMaker(String type) {
        super(type);
    }

    @Override
    List<Food> takeMaterialByMeal() {
        List<Food> pizzaMaterials = PizzaFactory.getPizzaMaterials(type);
        System.out.println("Materials were taken...");
        System.out.println(pizzaMaterials);
        return pizzaMaterials;
    }

    @Override
    void prepareMaterials(List<Food> foods) {
        System.out.println("Materials were prepared...");
    }

    @Override
    boolean bake() {
        System.out.println("Pizza was baked...");
        return true;
    }
}
