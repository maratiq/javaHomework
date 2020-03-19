package hw4.task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    static final int minArrayLength = 10;
    static final int maxArrayLength = 100;
    static final int minElement = 10;
    static final int maxElement = 100;

    public static int generateRandomArrayLength(int minArrayLength, int maxArrayLength) {
        return (int) ((Math.random() * (maxArrayLength - minArrayLength)) + minArrayLength);
    }

    public static int[] generateArray(int arrayLength, int minElement, int maxElement) {
        int[] array = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            array[i] = (int) (int) ((Math.random() * (maxElement - minElement)) + minElement);
        }
        return array;
    }

    public static void main(String[] args) {
        int arrayLength = generateRandomArrayLength(minArrayLength, maxArrayLength);
        int [] array = generateArray(arrayLength, minElement, maxElement);

        ExecutorService executorService = Executors.newFixedThreadPool(arrayLength);

        for(int i = 0; i < arrayLength; i++) {
            executorService.submit(new Factorial(array[i], i));
        }
        executorService.shutdown();
    }
}
