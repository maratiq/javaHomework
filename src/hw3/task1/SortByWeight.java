package hw3.task1;

import java.util.Comparator;

public class SortByWeight implements Comparator<Animal> {
    public int compare(Animal obj1, Animal obj2) {
        double weight1 = obj1.getWeight();
        double weight2 = obj2.getWeight();

        if (weight1 > weight2) {
            return 1;
        } else if (weight1 < weight2) {
            return -1;
        } else {
            return 0;
        }
    }
}
