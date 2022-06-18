 

/**
 * It's used for take address operations
 *
 * @author Hikmet
 * @since 2022-06-18
 */
public class AddressOperationFactory {

    public static AddressOperation getInstance(int decision) {
        switch (decision) {
            case 1: return new AddAddressOperation();
            case 2: return new ChangeAddressOperation();
            default: return null;
        }
    }
}
