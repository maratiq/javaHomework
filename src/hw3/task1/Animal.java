package hw3.task1;

public class Animal {

    private int id;
    private String name;
    private Person owner;
    private double weight;

    Animal(int id, String name, Person owner, double weight) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getOwnerName() {
        return owner.getName();
    }

    @Override
    public String toString() {
        return "Id: " + String.valueOf(id) + ", Кличка: " + String.valueOf(name) + ", Хозяин: " + owner.toString()
                + ", Вес - "
                + String.valueOf(weight);
    }
}
