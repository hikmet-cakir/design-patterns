import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class TurkeyChef implements Chef {

    private static final Map<FoodType, TurkeyFood> TURKEYFOODS;

    static {
        TURKEYFOODS = new EnumMap<FoodType, TurkeyFood>(FoodType.class);
        Arrays.stream(FoodType.values()).forEach(type -> TURKEYFOODS.put(type, new TurkeyFood(type)));
    }

    @Override
    public Food make(FoodType foodType) {
        return TURKEYFOODS.get(foodType);
    } 
}