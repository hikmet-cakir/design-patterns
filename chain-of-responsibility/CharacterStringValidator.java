import java.util.regex.Pattern;

public class CharacterStringValidator extends StringValidator {

    @Override
    public boolean check(String value) {
        if (!Pattern.matches("[a-zA-Z]+", value)) {
            return false;
        }
        return checkNext(value);
    }
}