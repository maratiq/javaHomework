package hw3.task1;

import java.util.Comparator;

public class SortByName implements Comparator<Animal> {
    public int compare(Animal obj1, Animal obj2) {
        String name1 = obj1.getName();
        String name2 = obj2.getName();

        return name1.compareTo(name2);
    }
}
