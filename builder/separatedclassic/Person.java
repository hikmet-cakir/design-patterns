/**
 * It's used for definition to Person
 *
 * @author Hikmet
 * @since 26-05-2022+03:00
 */
public class Person {

    private String firstName;

    private String lastName;

    private String nationality;

    public Person(String firstName, String lastName, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }
}
