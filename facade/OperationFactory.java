 

/**
 * It's used for take exist operation
 *
 * @author Hikmet
 * @since 2022-06-18
 */
public class OperationFactory {

    public static Operation getInstance(int number) {
        switch (number) {
            case 1: return new CustomerOperation();
            case 2: return new BudgetOperation();
            case 3: return new AddressOperation();
            default: return null;
        }
    }
}