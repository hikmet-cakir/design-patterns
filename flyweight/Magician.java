public class Magician extends Character {

    @Override
    public void attack() {
        System.out.println("Magician is attacking with " + getWeapon() + " in " + getLocation());
    }
}
