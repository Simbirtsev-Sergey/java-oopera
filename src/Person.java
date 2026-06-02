public class Person {
    protected String name;
    protected String surname;
    protected Sex gender;

    public Person(String name, String surname, Sex gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public void printFullName() {
        System.out.print(name + " " + surname + " ");
    }
}
