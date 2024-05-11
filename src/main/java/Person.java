import java.util.Optional;
import java.util.OptionalInt;

public class Person {
    private Optional<String> firstName;

    protected final String name;
    protected final String surname;
    protected OptionalInt age;
    protected Optional<String> address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = OptionalInt.of(age);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder();
    }

    public boolean hasAge() {
        return getAge().isPresent();
    }
    public boolean hasAddress() {
        return false ? getAddress().isEmpty() : true;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public OptionalInt getAge() {
        return age;
    }
    public String getAddress() {
        return address.get();
    }

    public void setAddress(String address) {
        this.address = Optional.of(address);
    }

    public void happyBirthday() {
        age = OptionalInt.of(getAge().getAsInt() + 1);
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}