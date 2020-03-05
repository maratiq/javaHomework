package homeWork3;

public class Person {

    private String name;
    private String sex;
    private int age;

    Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    public String getSex() {
        return sex;
    }

    public void setName(String sex) {
        this.sex = sex;
    }

    public float getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Имя: " + String.valueOf(name) + ", Пол: " + String.valueOf(sex)
                + ", Возраст - "
                + String.valueOf(age);
    }

}
