package HW_Java.hw4;
import java.util.*;


public class hw4_1 {
    //    1. Реализовать консольное приложение, которое:
//    Принимает от пользователя и “запоминает” строки.
//    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//    Если введено revert, удаляет предыдущую введенную строку из памяти.
    public static void main(String[] args) {
        rememberString();
    }

    private static void rememberString() {
        LinkedList<String> userText = new LinkedList<>();
        LinkedList<String> rememberText = new LinkedList<>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String text = scanner.nextLine();
            userText.add(text);
            rememberText.add(text);

            if (text.equals("print")) {
                rememberText.remove("print");
                userText.remove("print");
                Collections.swap(userText, 0, userText.size() - 1);
            }
            if (text.equals("revert")) {
                rememberText.remove("revert");
                userText.remove("revert");
                userText.remove(rememberText.get(rememberText.size()-1));
                rememberText.removeLast();
            }
//            System.out.println(rememberText);
            System.out.println(userText);
        }
    }
}





