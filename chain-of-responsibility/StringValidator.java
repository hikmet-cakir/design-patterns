public abstract class StringValidator {

    private StringValidator next;

    public static StringValidator link(StringValidator first, StringValidator... chain) {
        StringValidator head = first;
        for(StringValidator nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(String value);

    protected boolean checkNext(String value) {
        if(next == null) {
            return true;
        }
        return next.check(value);
    }
}
