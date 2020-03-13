package hw3.task1;

import java.util.Comparator;

public class SortByOwnerName implements Comparator<Animal> {
    public int compare(Animal obj1, Animal obj2) {
        String ownerName1 = obj1.getOwnerName();
        String ownerName2 = obj2.getOwnerName();

        return ownerName1.compareTo(ownerName2);
    }
}
