package hw3.task1;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal(1, "Sharik", new Person("Patrick", "male", 33), 21.2));
        animals.add(new Animal(2, "Bob", new Person("James", "male", 43), 20.2));
        animals.add(new Animal(3, "Tim", new Person("Patricia", "female", 23), 18.2));
        CardFile cf = new CardFile(animals);

        System.out.println(cf.toString());

        System.out.println(cf.search("Bob"));

        cf.changeData(1);

        System.out.println(cf.toString());

        cf.sortByWeight();

        System.out.println(cf.toString());

        cf.sortByName();

        System.out.println(cf.toString());

        cf.sortByOwnerName();

        System.out.println(cf.toString());

        cf.add();

        System.out.println(cf.toString());

    }
}
