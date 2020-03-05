package homeWork3;

import java.util.Arrays;

public class homeWork3 implements Comparable<Person> {
    public static void main(String[] args) {

        // Массив людей
        Person[] persons = new Person[5];
        int before = (int) System.currentTimeMillis();

        persons[0] = new Person("Иван", "MAN", 22);
        persons[1] = new Person("Иванка", "WOMAN", 12);
        persons[2] = new Person("Петр", "MAN", 32);
        persons[3] = new Person("Патриция", "WOMAN", 31);
        persons[4] = new Person("Патрик", "MAN", 44);

        System.out.println("Без сортировки");
        for (Person person : persons)
            System.out.println(person.toString());
        int after = (int) System.currentTimeMillis();

        Arrays.sort(persons, new SortBySex());
        System.out.println("Сортировка по полу");

        for (Person person : persons)
            System.out.println(person.toString());
        System.out.println("Время исполнения = " + (after - before) + " мс.");


        Arrays.sort(persons, new SortByAge());
        System.out.println("Сортировка по Возрасту");

        for (Person product : persons)
            System.out.println(product.toString());
        System.out.println("Время исполнения = " + (after - before) + " мс.");

    }

    // Переопределение метода
    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
