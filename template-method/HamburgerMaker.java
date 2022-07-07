import java.util.List;

public class HamburgerMaker extends Maker {

    public HamburgerMaker(String type) {
        super(type);
    }

    @Override
    List<Food> takeMaterialByMeal() {
        List<Food> hamburgerMaterials = HamburgerFactory.getHamburgerMaterials(type);
        System.out.println("Materials were taken...");
        System.out.println(hamburgerMaterials);
        return hamburgerMaterials;
    }

    @Override
    void prepareMaterials(List<Food> foods) {
        System.out.println("Materials were prepared...");
    }

    @Override
    boolean bake() {
        System.out.println("Hamburger was baked...");
        return true;
    }
}