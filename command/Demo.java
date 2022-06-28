public class Demo {

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        coffeeMaker.setCommand(new DoFilterCoffeeCommand());
        coffeeMaker.prepareCoffee();

        coffeeMaker.setCommand(new DoCaramelFrappuccinoCommand());
        coffeeMaker.prepareCoffee();

        coffeeMaker.setCommand(new DoWhiteChocolateMochaCommand());
        coffeeMaker.prepareCoffee();
    }
}