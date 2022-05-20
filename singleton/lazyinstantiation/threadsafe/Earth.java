/**
 * @author Hikmet
 * @since 20-05-2022+03:00
 */
public class Earth {
    // It's used for indicate to Earth's living population
    private int population = 0;
    // It indicate Earth our used
    private static volatile Earth instance;
    // We don't want to multiple instance so we have to set access modifier to private
    private Earth() {
    }
    // This method is used for get to Earth
    public static Earth getInstance() {
        if(instance == null) {
            synchronized (Earth.class) {
                if(instance == null) {
                    instance = new Earth();
                }
            }
        }
        return instance;
    }
    // If you want to increase population, you have to use this method
    public synchronized void addToPopulation(int addAmount) {
        population += addAmount;
    }
    // If you want to decrease population, you have to use this method
    public synchronized void subtractFromPopulation(int subtractAmount) {
        population -= subtractAmount;
    }
    // If you want to get to population, you have to use this method
    public synchronized int getPopulation() {
        return population;
    }
}