import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Hikmet
 * @since 20-05-2022+03:00
 */
public class EarthTest {

    public static final int ADD_AMOUNT = 100;

    public static final int POSSIBLE_RESULT_1 = 0;

    public static final int POSSIBLE_RESULT_2 = 100;

    public static final int POSSIBLE_RESULT_3 = 200;

    public static final int POSSIBLE_RESULT_4 = 300;

    @Test
    public void when_getInstanceTwiceTimesOfEarth_expect_takeSameInstance() {
        // Given
        Earth instance1 = Earth.getInstance();
        Earth instance2 = Earth.getInstance();

        // When
        boolean isEqual = instance1 == instance2;

        // Then
        assertTrue(isEqual);
    }

    @Test
    public void when_changePopulationWithMultipleThread_expect_changeableResult() {
        // Given
        Earth instance = Earth.getInstance();
        Runnable runnable = () -> instance.addToPopulation(ADD_AMOUNT);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        // When
        thread1.start();
        thread2.start();
        thread3.start();

        // Then
        List<Integer> possibleResults = Arrays.asList(POSSIBLE_RESULT_1, POSSIBLE_RESULT_2, POSSIBLE_RESULT_3, POSSIBLE_RESULT_4);
        boolean result = possibleResults.contains(instance.getPopulation());
        assertTrue(result);
    }
}
