  

/**
 * It's used for define budget operations
 *
 * @author Hikmet
 * @since 2022-06-18
 */
public class BudgetOperation implements Operation {
    @Override
    public void sayAllOperations() {
        System.out.println("For Budget Edited Press 1");
        System.out.println("For Budget Delete Press 2");
    }

    @Override
    public void doOperation() {
        sayAllOperations();
        BudgetOperation subOperation = null;
        while(subOperation == null) {
            int decision = Interaction.takeDecision();
            subOperation = BudgetOperationFactory.getInstance(decision);
            if(subOperation == null) {
                System.out.println("You Have Pressed Wrong Combination, Please Try Again!");
            }
        }
        subOperation.doOperation();
    }
}
