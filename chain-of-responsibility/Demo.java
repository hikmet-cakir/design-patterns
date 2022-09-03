public class Demo {

    public static void main(String[] args) {
        StringValidator[] chain = { new CharacterStringValidator(), new SpecialCharacterStringValidator() };
        StringValidator first = new BlankStringValidator();
        StringValidator stringValidator = StringValidator.link(first, chain);

        boolean numberOne = stringValidator.check(null);
        System.out.println("Number One=" + numberOne);

        boolean numberTwo = stringValidator.check("快乐的时光");
        System.out.println("Number Two=" + numberTwo);

        boolean numberThree = stringValidator.check("1Hello2World3");
        System.out.println("Number Two=" + numberThree);

        boolean numberFour = stringValidator.check("#Hello*World$");
        System.out.println("Number Three=" + numberFour);

        boolean numberFive = stringValidator.check("HelloWorld");
        System.out.println("Number Four=" + numberFive);
    }
}