package HW_Java.hw3;

import java.util.*;
import java.util.stream.IntStream;

public class hw3_2 {

    public static void main(String[] args) {
//  Задан целочисленный список ArrayList. Найти минимальное,
//  максимальное и среднее арифметическое из этого списка.
        maxMinAverage();

    }

    private static void maxMinAverage() {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < random.nextInt(3, 100); i++) {
            numbers.add(random.nextInt(1, random.nextInt(1000)));
        }
        System.out.println(numbers);
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));


        System.out.printf("%.0f\n", numbers.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0));

//        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum / numbers.size());
    }


}


