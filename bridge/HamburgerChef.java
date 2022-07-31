public class HamburgerChef implements Chef {
    @Override
    public Meal makeMeal(String meal) {
        return HamburgerFactory.getHamburgerMaterials(meal);
    }
}
