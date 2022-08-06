import java.util.List;

public interface CompositeMeal {
    void addMeal(Meal meal);

    void removeMeal(Meal meal);

    List<Meal> getMeals();

    void showMeals();
}