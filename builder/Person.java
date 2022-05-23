/**
 *
 * @author Hikmet
 * @since 23-05-2022+03:00
 */
public final class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private Float height;
    private Float weight;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Float getHeight() {
        return height;
    }

    public Float getWeight() {
        return weight;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private Integer age;
        private Float height;
        private Float weight;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setHeight(Float height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(Float weight) {
            this.weight = weight;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}