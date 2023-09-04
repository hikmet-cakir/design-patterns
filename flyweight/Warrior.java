
public class Warrior extends Character {

    @Override
    public void attack() {
        System.out.println("Warrior is attacking with " + getWeapon() + " in " + getLocation());
    }
}