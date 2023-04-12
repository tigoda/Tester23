package HW_Java.hw5;

import java.util.*;

public class hw5_1 {
    public static void main(String[] args) {
//        1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может
//        иметь несколько телефонов.
        phonebook();
    }

    private static void phonebook() {
        HashMap<String, String> book = new HashMap<>();


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ФИО: ");
            String name = scanner.nextLine();

            if (!name.matches("^[a-zA-Z]*$")) {
                System.out.print("Не верный ввод");
                break;
            }

            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Введите телефон: ");
            String number = scanner1.nextLine();


            if (!book.containsKey(name)) {
                book.putIfAbsent(name, number);
            } else {
                if (!Objects.equals(number, book.get(name))) {
                    book.put(name, book.get(name) + ", " + number);
                }
                book.putIfAbsent(name, number);
            }

            for (Map.Entry entry : book.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());

            }
        }
    }
}





