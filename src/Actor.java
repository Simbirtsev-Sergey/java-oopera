import java.util.Objects;

public class Actor extends Person {
    protected int height;

    public Actor(String name, String surname, Sex gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public void printFullName() {
        super.printFullName();
        System.out.println("(" + height + ")");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height && actor.name.equals(name) && actor.surname.equals(surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}
