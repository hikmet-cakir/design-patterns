import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class ItalianChef implements Chef {

    private static final Map<FoodType, ItalianFood> ITALIANFOODS;

    static {
        ITALIANFOODS = new EnumMap<FoodType, ItalianFood>(FoodType.class);
        Arrays.stream(FoodType.values()).forEach(type -> ITALIANFOODS.put(type, new ItalianFood(type)));
    }

    @Override
    public Food make(FoodType foodType) {
        return ITALIANFOODS.get(foodType);
    }
}