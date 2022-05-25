/**
 * It's used for building to Neptune planet
 *
 * @author Hikmet
 * @since 25-05-2022+03:00
 */
public class NeptunePlanetBuilder extends PlanetBuilder {

    @Override
    public void setGravity() {
        this.planet.setGravity(11.15F);
    }

    @Override
    public void setRadius() {
        this.planet.setRadius(24622F);
    }

    @Override
    public void setOrbitalPeriod() {
        this.planet.setOrbitalPeriod(165);
    }
}
