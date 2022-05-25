import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

    public static final String FIRST_NAME = "Cheong";

    public static final String LAST_NAME = "Jing";

    public static final Integer AGE = 30;

    public static final Float HEIGHT = 1.7F;

    public static final Float WEIGHT = 1.7F;

    @Test
    public void when_creatingPersonWithBuilder_expect_successCreation() {
        // Given
        Person createdPerson;

        // When
        createdPerson = new Person.Builder()
                .setFirstName(FIRST_NAME)
                .setLastName(LAST_NAME)
                .setAge(AGE)
                .setHeight(HEIGHT)
                .setWeight(WEIGHT)
                .build();

        // Then
        assertEquals(FIRST_NAME, createdPerson.getFirstName());
        assertEquals(LAST_NAME, createdPerson.getLastName());
        assertEquals(AGE, createdPerson.getAge());
        assertEquals(HEIGHT, createdPerson.getHeight());
        assertEquals(WEIGHT, createdPerson.getWeight());
    }
}
