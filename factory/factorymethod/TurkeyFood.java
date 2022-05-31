public class TurkeyFood implements Food {

    private final FoodType foodType;

    public TurkeyFood(FoodType foodType) {
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "TurkeyFood{" +
                "foodType=" + foodType +
                '}';
    }
}