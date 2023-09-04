import java.util.Locale;

public enum WeaponType {
    SWORD,
    WAND,
    BOW;

    @Override
    public String toString() {
        return this.name().toLowerCase(Locale.ROOT);
    }
}
