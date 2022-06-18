 

/**
 * It's used for take exist budget operation
 *
 * @author Hikmet
 * @since 2022-06-18
 */
public class BudgetOperationFactory {

    public static BudgetOperation getInstance(int decision) {
        switch (decision) {
            case 1: return new EditBudgetOperation();
            case 2: return new DeleteBudgetOperation();
            default: return null;
        }
    }
}
