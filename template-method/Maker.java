import java.util.List;

public abstract class Maker {

    String type;

    public Maker(String type) {
        this.type = type;
    }

    abstract List<Food> takeMaterialByMeal();

    abstract void prepareMaterials(List<Food> foods);

    abstract boolean bake();

    public void make() {
        List<Food> foods = takeMaterialByMeal();
        prepareMaterials(foods);
        bake();
    }
}