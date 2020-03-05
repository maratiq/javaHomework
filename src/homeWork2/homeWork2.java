package homeWork2;

import java.util.Random;
import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int k = random.nextInt(100);
            try {
                if (k < 0) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                continue;
            }
            double q = Math.sqrt(k);
            if ((((int) q) * ((int) q)) == k) {
                System.out.println(k);
            }
        }
    }
}
