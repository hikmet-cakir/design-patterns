public class HamburgerFactory {

    public static Meal getHamburgerMaterials(String hamburgerType) throws UnsupportedOperationException {
        switch(hamburgerType) {
            case "Cheeseburger" :
                return Meal.CHEESEBURGER;
            case "Mexicanoburger" :
                return Meal.MEXICANOBURGER;
            case "Onion" :
                return Meal.ONIONBURGER;
            default :
                System.err.println("Doesn't Match!");
        }
        throw new UnsupportedOperationException("Unsupported Burger Type:" + hamburgerType);
    }
}