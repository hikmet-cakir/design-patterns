/**
 * It's used for building to any planet
 *
 * @author Hikmet
 * @since 25-05-2022+03:00
 */
public abstract class PlanetBuilder {
    protected Planet planet;

    public Planet getPlanet() {
        return planet;
    }

    public void createPlanet() {
        planet = new Planet();
    }

    public abstract void setGravity();

    public abstract void setRadius();

    public abstract void setOrbitalPeriod();
}
