package HW_Java;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class hw1_3 {
    public static void main(String[] args) {
//        В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
        userGreeting();
    }

    private static void userGreeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();
        GregorianCalendar time = new GregorianCalendar();

        if (time.get(Calendar.HOUR_OF_DAY) < 11 & time.get(Calendar.MINUTE) < 59) {
            System.out.printf("Доброе утро, %s !", name);
        } else if (time.get(Calendar.HOUR_OF_DAY) < 17 & time.get(Calendar.MINUTE) < 59) {
            System.out.printf("Добрый день, %s !", name);
        } else if (time.get(Calendar.HOUR_OF_DAY) < 22 & time.get(Calendar.MINUTE) < 59) {
            System.out.printf("Добрый вечер, %s !", name);
        } else {
            System.out.printf("Доброй ночи, %s !", name);
        }
    }
}
