import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    private static final Map<ProfessionType, Character>  characterByProfessionType = new HashMap<>();

    public static Character getCharacter(ProfessionType professionType) {
        return characterByProfessionType.computeIfAbsent(professionType, CharacterFactory::createCharacterByProfessionType);
    }

    private static Character createCharacterByProfessionType(ProfessionType professionType) {
        return switch (professionType) {
            case WARRIOR -> new Warrior();
            case MAGICIAN -> new Magician();
        };
    }
}