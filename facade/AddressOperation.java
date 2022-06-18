 

/**
 * It's used for define address operation
 *
 * @author Hikmet
 * @since 2022-06-18
 */
public class AddressOperation implements Operation {
    @Override
    public void sayAllOperations() {
        System.out.println("For Address Change Press 1");
        System.out.println("If You Haven't Any Defined Address, For Address Add Press 2");
    }

    @Override
    public void doOperation() {
        sayAllOperations();
        AddressOperation subOperation = null;
        while(subOperation == null) {
            int decision = Interaction.takeDecision();
            subOperation = AddressOperationFactory.getInstance(decision);
            if(subOperation == null) {
                System.out.println("You Have Pressed Wrong Combination, Please Try Again!");
            }
        }
        subOperation.doOperation();
    }
}
