/**
 * It's used for build Person
 *
 * @author Hikmet
 * @since 26-05-2022+03:00
 */
public class PersonBuilder {

    private String firstName;

    private String lastName;

    private String nationality;

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public Person build() {
        return new Person(firstName, lastName, nationality);
    }
}