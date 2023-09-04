
public abstract class Character {

    private WeaponType weapon;
    private Location location;

    public Character() {
        // Let's suppose that there are lots of codes in there and these codes consume lots of memory & time
        // To simulate this scenario, These code pieces are added.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract void attack();

    // Getters & Setters
    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
