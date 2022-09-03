public class BlankStringValidator extends StringValidator {

    @Override
    public boolean check(String value) {
        if(value == null || value.isBlank()) {
            return false;
        }
        return checkNext(value);
    }
}