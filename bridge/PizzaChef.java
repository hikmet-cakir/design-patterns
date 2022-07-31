public class PizzaChef implements Chef {
    @Override
    public Meal makeMeal(String meal) {
        return PizzaFactory.getPizzaMaterials(meal);
    }
}
