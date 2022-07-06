import java.util.List;

public class PizzaMaker extends Maker {

    public PizzaMaker(String type) {
        super(type);
    }

    @Override
    List<Food> takeMaterialByMeal() {
        return null;
    }

    @Override
    void prepareMaterials(List<Food> foods) {

    }

    @Override
    boolean bake() {
        return false;
    }
}