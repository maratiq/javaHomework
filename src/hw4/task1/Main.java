package hw4.task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Zaripov
 *
 */

public class Main {

    static final int minArrayLength = 10; // минимальная длина массива
    static final int maxArrayLength = 100; // максимальная длина массива
    static final int minElement = 10; // минимальное значение элемента в массиве
    static final int maxElement = 100; // максимальное значение элемента в массиве

    // генерация рандомной длины массива
    public static int generateRandomArrayLength(int minArrayLength, int maxArrayLength) {
        return (int) ((Math.random() * (maxArrayLength - minArrayLength)) + minArrayLength);
    }

    // генерация массива с рандомными элементами c заданным диапазоном
    public static int[] generateArray(int arrayLength, int minElement, int maxElement) {
        int[] array = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++){
            array[i] = (int) (int) ((Math.random() * (maxElement - minElement)) + minElement);
        }
        return array;
    }

    public static void main(String[] args) {
        int arrayLength = generateRandomArrayLength(minArrayLength, maxArrayLength); // длина массива
        int [] array = generateArray(arrayLength, minElement, maxElement); // сгенерированный массив

        ExecutorService executorService = Executors.newFixedThreadPool(arrayLength); // пул потоков

        // цикл помещений потоков в пул
        for(int i = 0; i < arrayLength; i++) {
            executorService.submit(new Factorial(array[i], i)); // помещение потока в пул
        }
        executorService.shutdown(); // закрытие пула
    }
}
