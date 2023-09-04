
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class CombatArea {

    public static void main(String[] args) {
        Instant start = Instant.now();
        for (int i = 0; i < 10; i++) {
            performFlyweightApproach();
//            performClassicApproach();
        }
        Instant end = Instant.now();

        System.out.println("============Result============");
        printPerformanceTimeCalculations(start, end);
    }

    private static void printPerformanceTimeCalculations(Instant start, Instant end) {
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: "+ timeElapsed.toMillis()   + " milliseconds");

        double timeAsSecond = timeElapsed.toMillis() / 1000D % 60D;
        System.out.println("Time taken: "+ timeAsSecond + " seconds");
    }

    private static void performFlyweightApproach() {
        Character magician = CharacterFactory.getCharacter(ProfessionType.MAGICIAN);
        magician.setWeapon(WeaponType.WAND);
        magician.setLocation(generateRandomLocation());
        magician.attack();

        Character warrior = CharacterFactory.getCharacter(ProfessionType.WARRIOR);
        warrior.setWeapon(WeaponType.SWORD);
        warrior.setLocation(generateRandomLocation());
        warrior.attack();
    }

    private static void performClassicApproach() {
        Character magician = new Magician();
        magician.setWeapon(WeaponType.WAND);
        magician.setLocation(generateRandomLocation());
        magician.attack();

        Character warrior = new Magician();
        warrior.setWeapon(WeaponType.BOW);
        warrior.setLocation(generateRandomLocation());
        warrior.attack();
    }

    private static Location generateRandomLocation() {
        Random random = new Random();
        int lowerBound = 0;
        int upperBound = 500;
        int randomNumberX = random.nextInt(upperBound - lowerBound) + lowerBound;
        int randomNumberY = random.nextInt(upperBound - lowerBound) + lowerBound;
        return new Location(randomNumberX, randomNumberY);
    }
}
