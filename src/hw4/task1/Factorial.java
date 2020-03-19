package hw4.task1;

import java.math.BigInteger;

public class Factorial implements Runnable {
    int number;
    int thread;

    public Factorial(int number, int thread) {
         this.number = number;
         this.thread = thread;
    }

    private BigInteger factorialCalc(int number) {
        BigInteger result = BigInteger.valueOf(1);

        for (long i = 1; i <= number; i++) {
            BigInteger factor = BigInteger.valueOf(i);
            result = result.multiply(factor);
        }
        return result;
    }

    @Override
    public void run() {
        System.out.println("Number of thread " + thread + ", factorial of " + number + " equals " + factorialCalc(number));
    }
}
