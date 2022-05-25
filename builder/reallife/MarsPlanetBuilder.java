/**
 * It's used for building to Mars planet
 *
 * @author Hikmet
 * @since 25-05-2022+03:00
 */
public class MarsPlanetBuilder extends PlanetBuilder {

    // It is Planet's Gravity, Its value calculates by m/s^2
    @Override
    public void setGravity() {
        this.planet.setGravity(3.721F);
    }

    // It is Planet's Radius, Its value calculates by km
    @Override
    public void setRadius() {
        this.planet.setRadius(3389.5F);
    }

    // It is Planet's Orbital Period, Its value calculates by days
    @Override
    public void setOrbitalPeriod() {
        this.planet.setOrbitalPeriod(687);
    }
}