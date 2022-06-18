 

/**
 * It's used for define customer operation
 *
 * @author Hikmet
 * @since 2022-06-18
 */
public class CustomerOperation implements Operation {
    @Override
    public void sayAllOperations() {
        System.out.println("For Edited Exist Customer Information Press 1");
        System.out.println("If You Haven't Any Defined Information, For Add Customer Information Press 2 ");
    }

    @Override
    public void doOperation() {
        sayAllOperations();
        CustomerOperation subOperation = null;
        while(subOperation == null) {
            int decision = Interaction.takeDecision();
            subOperation = CustomerOperationFactory.getInstance(decision);
            if(subOperation == null) {
                System.out.println("You Have Pressed Wrong Combination, Please Try Again!");
            }
        }
        subOperation.doOperation();
    }
}
