import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlanetBuilderTest {

    public static final Float MARS_GRAVITY = 3.721F;

    public static final Float MARS_RADIUS = 3389.5F;

    public static final Integer MARS_ORBITAL_PERIOD = 687;

    @Test
    public void when_constructMarsPlanetWithBuilder_expect_successCreation() {
        // Given
        Astrophysicist astrophysicist4AnalyzeMars = new Astrophysicist();
        PlanetBuilder marsBuilder = new MarsPlanetBuilder();
        astrophysicist4AnalyzeMars.setPlanetBuilder(marsBuilder);

        // When
        astrophysicist4AnalyzeMars.constructPlanet();
        Planet result = astrophysicist4AnalyzeMars.getPlanet();

        // Then
        String expected = "Planet:[" +
                "gravity=" + MARS_GRAVITY +
                ", radius=" + MARS_RADIUS +
                ", orbitalPeriod=" + MARS_ORBITAL_PERIOD +
                ']';
        String actual = result.toString();
        assertEquals(expected, actual);
    }
}