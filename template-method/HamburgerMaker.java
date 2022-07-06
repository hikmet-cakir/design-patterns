import java.util.List;

public class HamburgerMaker extends Maker {

    public HamburgerMaker(String type) {
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