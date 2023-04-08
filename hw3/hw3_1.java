package HW_Java.hw3;

import java.util.ArrayList;
import java.util.Random;

public class hw3_1 {
    public static void main(String[] args) {
//        1. Пусть дан произвольный список целых чисел, удалить из него четные числа
//        (в языке уже есть что-то готовое для этого)
        oddNumbers();
    }

    private static void oddNumbers() {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < random.nextInt(1, 100); i++) {
            numbers.add(random.nextInt(1, random.nextInt(1000000000)));
        }
        System.out.println(numbers);
        numbers.removeIf(i -> (i % 2 == 0));
        System.out.println(numbers);

    }


}
