import java.util.regex.Pattern;

public class SpecialCharacterStringValidator extends StringValidator {

    @Override
    public boolean check(String value) {
        if (Pattern.matches(".*[\\p{Punct}].*", value)) {
            return false;
        }
        return checkNext(value);
    }
}