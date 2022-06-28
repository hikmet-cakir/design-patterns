public class CoffeeMaker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void prepareCoffee() {
        command.execute();
    }
}
