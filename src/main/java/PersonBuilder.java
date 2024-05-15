public class PersonBuilder {
    protected String name;
    protected String surname;
    protected Integer age;
    protected String address;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
            Person person;

            if(name == null) {
                throw new IllegalStateException("Не указано обязательное поле - имя");
            } else if(surname == null){
                throw new IllegalStateException("Не указано обязательное поле - фамилия");
            } else if(age < 0){
                throw new IllegalArgumentException("Неверные данные поля возраст");
            }

            if (age == null) {
                person = new Person(name, surname);
            } else {
                person = new Person(name, surname, age);
            }

            if (address != null) {
                person.setAddress(address);
            }

            return person;
    }
}
