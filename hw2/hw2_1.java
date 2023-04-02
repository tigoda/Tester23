package HW_Java.hw2;
import java.util.Scanner;

public class hw2_1 {
    public static void main(String[] args) {
//        Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
//         (возвращает boolean значение).
        System.out.println(palindrome());
    }

    private static boolean palindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());


    }
}

