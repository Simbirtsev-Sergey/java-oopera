import java.util.ArrayList;

public class Threatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Сергей", "Симбирцев", Sex.MALE, 190);
        Actor actor2 = new Actor("Эдуард", "Гембихнер", Sex.MALE, 185);
        Actor actor3 = new Actor("Дарья", "Петрова", Sex.FEMALE, 180);

        Director director1 = new Director("Иван", "Петров", Sex.MALE, 5);
        Director director2 = new Director("Михаил", "Кирху", Sex.MALE, 34);

        ArrayList<Actor> listOfActors1 = new ArrayList<>();
        listOfActors1.add(actor1);
        listOfActors1.add(actor2);
        Show show = new Show("Снеговик и Ко", 120, director1, listOfActors1);

        ArrayList<Actor> listOfActors2 = new ArrayList<>();
        listOfActors2.add(actor1);
        listOfActors2.add(actor2);
        listOfActors2.add(actor3);
        String librettoTextBallet = "Либретто балета «Лебединое озеро» Петра Ильича Чайковского создано на основе старинной " +
                "легенды о заколдованной девушке Одетте, превращённой в белого лебедя злым волшебником Ротбартом.";
        Ballet ballet = new Ballet("Лебединое озеро", 150, director2, listOfActors2, "Михаил Дзюба",
                librettoTextBallet, "Антон Тихомиров");


        ArrayList<Actor> listOfActors3 = new ArrayList<>();
        listOfActors3.add(actor1);
        listOfActors3.add(actor3);
        String librettoTextOpera = "Пиковая дама — опера Петра Ильича Чайковского в трёх действиях (семи картинах), "
                 + "созданная на основе одноимённой повести Александра Пушкина. Считается вершиной оперного творчества "
                 + "композитора и одним из шедевров русской и мировой классики. ";

        Opera opera = new Opera("Пиковая дама", 135, director1, listOfActors3, "Антон Заболотный",
                librettoTextOpera, 3);

        opera.addANewActor(actor2);
        // Здесь должно вывести сообщение о том, что такой актер уже есть
        opera.addANewActor(actor3);

        System.out.println("Актеры, которые участвуют в обычном спектакле: ");
        show.printAllActors();

        System.out.println("Актеры, которые участвуют в опере: ");
        opera.printAllActors();

        System.out.println("Актеры, которые участвуют в баллете: ");
        ballet.printAllActors();
        System.out.println("\n");


        show.replaceActor(actor3, "Гембихнер");
        System.out.println("Обновленные актеры, которые участвуют в обычном спектакле: ");
        show.printAllActors();
        System.out.println("\n");


        ballet.replaceActor(actor3, "Иванов");
        System.out.println("Актеры, которые участвуют в балете: ");
        ballet.printAllActors();


        System.out.println("Текст либретто для балета: ");
        ballet.printLibrettoText();
        System.out.println("\n");

        System.out.println("Текст либретто для оперного спектакля: ");
        opera.printLibrettoText();
        System.out.println("\n");
    }
}