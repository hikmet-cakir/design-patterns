public enum FoodType {
    KEBAB("kebab"),
    PIZZA("pizza");

    private final String food;

    FoodType(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "FoodType{" +
                "food='" + food + '\'' +
                '}';
    }
}