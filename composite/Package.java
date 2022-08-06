import java.util.ArrayList;
import java.util.List;

public class Package extends Meal implements CompositeMeal {

    private final List<Meal> meals = new ArrayList<>();

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    @Override
    public void removeMeal(Meal meal) {
        meals.remove(meal);
    }

    @Override
    public List<Meal> getMeals() {
        return meals;
    }

    @Override
    public void showMeals() {
        meals.forEach(Meal::printMealInformation);
    }

    @Override
    public void eat() {
        meals.forEach(meal -> System.out.println(meal.name + " which price is " + meal.price + " was eaten"));
    }
}