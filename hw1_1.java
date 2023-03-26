package HW_Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class hw1_1 {
    public static void main(String[] args) {
        //Задать одномерный массив и найти в нем минимальный и максимальный элементы
        minAndMaxElement();
    }
    private static void minAndMaxElement() {
        int[] myArr = new int[10];
        Random random = new Random();
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(1001);
        }
        List<Integer> ints = Arrays.stream(myArr).boxed().toList();

        System.out.printf("%s \nМинимальный элемент %s \nМаксимальный элемент %s", Arrays.toString(myArr),
                Collections.min(ints),
                Collections.max(ints));
    }
}
