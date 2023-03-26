package HW_Java;

import java.util.Arrays;

public class hw1_2 {
    public static void main(String[] args) {
//        Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//        а остальные - равны ему.
        arrSort();

    }

    private static void arrSort() {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int el = nums[j];
                nums[j] = nums[i];
                nums[i] = el;
                j++;

            }
        }
        System.out.println(Arrays.toString(nums));
    }
}




