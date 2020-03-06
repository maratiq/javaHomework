package homeWork4;

public class Homework4 {
    public static void main(String[] args) {
        Number[] numberArray = {1, 2, 3, 4, 5};

        MathBox mathBox = new MathBox(numberArray);

        System.out.println(mathBox.getArrayList());

        int sum = mathBox.summator();

        System.out.println(sum);

        //mathBox.splitter(4);
        mathBox.removeElement(3);

        System.out.println(mathBox.getArrayList());


    }
}
