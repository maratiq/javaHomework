package hw4.task1;

import java.math.BigInteger;

public class Factorial implements Runnable {
    private int number; // число у которого будет считываться факториал
    private int thread; // номер потока

    // конструктор класса
    public Factorial(int number, int thread) {
         this.number = number;
         this.thread = thread;
    }

    // метод по вычислению факториала числа
    private BigInteger factorialCalc(int number) {
        BigInteger result = BigInteger.valueOf(1);

        for (long i = 1; i <= number; i++) {
            BigInteger factor = BigInteger.valueOf(i);
            result = result.multiply(factor);
        }
        return result;
    }

    // переопределение метода родительского класса
    @Override
    public void run() {
        System.out.println("Number of thread " + thread + ", factorial of " + number + " equals " + factorialCalc(number));
    }
}
