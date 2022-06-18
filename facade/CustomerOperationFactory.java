 

/**
 * It's used for take exist customer operations
 *
 * @author Hikmet
 * @since 2022-06-18
 */
public class CustomerOperationFactory {

    public static CustomerOperation getInstance(int decision) {
        switch (decision) {
            case 1: return new AddCustomerOperation();
            case 2: return new EditCustomerOperation();
            default: return null;
        }
    }
}