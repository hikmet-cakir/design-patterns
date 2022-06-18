 
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * It's used for take user's decision
 *
 * @author Hikmet
 * @since 2022-06-18
 */
public class Interaction {
    public static int takeDecision() {
        System.out.println("Please Enter the You Decision : ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String pressedDecision = reader.readLine();
            return Integer.parseInt(pressedDecision);
        } catch (Exception e) {
            System.out.println("You Pressed Wrong Or Miss Number! Please Press Again!");
            takeDecision();
        }
        return 0;
    }
}
