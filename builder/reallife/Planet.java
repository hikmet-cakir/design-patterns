/**
 * It's used for representing to any planet
 *
 * @author Hikmet
 * @since 25-05-2022+03:00
 */
public class Planet {

    private Float gravity;

    private Float radius;

    private Integer orbitalPeriod;

    public void setGravity(Float gravity) {
        this.gravity = gravity;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public void setOrbitalPeriod(Integer orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    @Override
    public String toString() {
        return "Planet:[gravity=" + gravity + ", radius=" + radius + ", orbitalPeriod=" + orbitalPeriod + ']';
    }
}
