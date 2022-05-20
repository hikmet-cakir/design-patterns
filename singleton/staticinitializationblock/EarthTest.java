import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Hikmet
 * @since 20-05-2022+03:00
 */
public class EarthTest {

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
}