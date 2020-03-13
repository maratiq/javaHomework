package hw3.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class CardFile implements Comparable<Animal> {
    private ArrayList<Animal> cardFile;

    CardFile(ArrayList<Animal> cardFile) {
        this.cardFile = cardFile;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Animal animal : cardFile) {
            stringBuilder.append(animal.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void add() {
        int id = 0;
        String name = null;
        String ownerName = null;
        String ownerSex = null;
        int ownerAge = 0;
        double weight = 0;
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Id");
        try {
            id = Integer.parseInt(reader1.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите кличку");
        try {
            name = reader2.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя хозяина");
        try {
            ownerName = reader3.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите пол хозяина");
        try {
            ownerSex = reader4.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите возраст хозяина");
        try {
            ownerAge = Integer.parseInt(reader5.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader reader6 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите вес");
        try {
            weight = Double.parseDouble(reader6.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        cardFile.add(new Animal(id, name, new Person(ownerName, ownerSex, ownerAge), weight));
    }

    public void changeData(int animalId) {
        for (Animal animal : cardFile) {
            if (animal.getId() == animalId) {
                BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                try {
                    System.out.println("Введите новую кличку");
                    animal.setName(reader1.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
                try {
                    System.out.println("Введите вес");
                    animal.setWeight(Double.parseDouble(reader2.readLine()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Animal search(String name) {
        for (Animal animal : cardFile) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }

    public void sortByWeight() {
        cardFile.sort(new SortByWeight());
    }

    public void sortByName() {
        Collections.sort(cardFile, new SortByName());
    }

    public void sortByOwnerName() {
        Collections.sort(cardFile, new SortByOwnerName());
    }

    @Override
    public int compareTo(Animal o) {
        return 0;
    }
}
