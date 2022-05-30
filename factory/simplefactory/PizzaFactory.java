public class PizzaFactory {

    public static Pizza createMargheritaPizza() {
        return new MargheritaPizza();
    }

    public static Pizza createSaporePizza() {
        return new SaporePizza();
    }

    public static Pizza createVegetablePizza() {
        return new VegetablePizza();
    }
}