public class Kitchen implements Restaurant {

    private Chef chef;

    public Kitchen(Chef chef) {
        this.chef = chef;
    }

    public Meal makeIt(String meal) {
        return chef.makeMeal(meal);
    }
}
