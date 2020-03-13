package homeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Homework5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Создание стрима из массива
        /**
         * @param split разбивает заданную строку на основе разделителя, возвращая массив строк через проббел.
         */
        List<String> list = Arrays.stream(reader.readLine().split("\\s")).collect(Collectors.toList());
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            String s = (String) iterator.next();
            System.out.println(s);
            if (s.equals("Raz"))
                System.out.println("Dva");
        }
    }
}
