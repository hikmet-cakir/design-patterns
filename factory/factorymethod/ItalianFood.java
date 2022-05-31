public class ItalianFood implements Food {

    private final FoodType foodType;

    public ItalianFood(FoodType foodType) {
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "ItalianFood{" +
                "foodType=" + foodType +
                '}';
    }
}