 
/**
 * It's represented a classic operator
 *
 * @author Hikmet
 * @since 2022-06-18
 */
public class OperatorFacade {

    private static void sayAllGeneralOperations() {
        System.out.println("For Customer Operations Press 1");
        System.out.println("For Budget Operations Press 2");
        System.out.println("For Address Operations Press 3");
    }

    public static void callOperator() {
        sayAllGeneralOperations();
        Operation operation = null;
        while (operation == null) {
            int decisionNumber = Interaction.takeDecision();
            operation = OperationFactory.getInstance(decisionNumber);
            if(operation == null) {
                System.out.println("You Have Pressed Wrong Combination, Please Try Again!");
            }
        }
        operation.doOperation();
    }
}