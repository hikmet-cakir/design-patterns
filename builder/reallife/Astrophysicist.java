/**
 * This structure shows person who will analyze some planet
 *
 * @author Hikmet
 * @since 25-05-2022+03:00
 */
public class Astrophysicist {

    private PlanetBuilder planetBuilder;

    public void setPlanetBuilder(PlanetBuilder planetBuilder) {
        this.planetBuilder = planetBuilder;
    }

    public Planet getPlanet() {
        return planetBuilder.getPlanet();
    }

    public void constructPlanet() {
        planetBuilder.createPlanet();
        planetBuilder.setGravity();
        planetBuilder.setRadius();
        planetBuilder.setOrbitalPeriod();
    }
}