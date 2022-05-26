import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonBuilderTest {

    public static final String PERSON_FIRST_NAME = "Christopher";

    public static final String PERSON_LAST_NAME = "Sams";

    public static final String PERSON_NATIONALITY = "American";

    @Test
    public void when_buildPersonWithPersonBuilder_expect_successCreate() {
        // Given
        PersonBuilder personBuilder = new PersonBuilder();


        // When
        Person actualPerson = personBuilder
                .setFirstName(PERSON_FIRST_NAME)
                .setLastName(PERSON_LAST_NAME)
                .setNationality(PERSON_NATIONALITY)
                .build();

        // Then
        assertEquals(PERSON_FIRST_NAME, actualPerson.getFirstName());
        assertEquals(PERSON_LAST_NAME, actualPerson.getLastName());
        assertEquals(PERSON_NATIONALITY, actualPerson.getNationality());
    }
}
