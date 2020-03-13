package hw3.task1;

public class Person {

    private String name;
    private String sex;
    private int age;

    Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{ Имя: " + String.valueOf(name) + ", Пол: " + String.valueOf(sex)
                + ", Возраст - "
                + String.valueOf(age) + "}";
    }
}
