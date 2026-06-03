package Show;

import Person.Actor;
import Person.Director;

import java.util.ArrayList;

public class Show {
    private String title;
    // Длительность спектакля в минатах
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public Show() {}

    public void printAllActors() {
        for (Actor actor: listOfActors) {
            actor.printFullName();
        }
    }

    public void addANewActor(Actor newActor) {
        for (Actor actor: listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Добавление невозможно. Данный актер уже участвует в театре.");
                return;
            }
        }
        listOfActors.add(newActor);
    }

    public void replaceActor(Actor newActor, String surname) {
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                return;
            }
        }
        System.out.println("Актер с данной фамилией отсутствует. Не удалось поменять актера");
    }
}