package HW_Java.hw5;

import java.util.*;

public class hw5_2 {
    public static void main(String[] args) {
//    Пусть дан список сотрудников:
//    Иван Иванов1
//    Светлана Петрова1
//    Кристина Белова1
//    Анна Мусина1
//    Анна Крутова2
//    Иван Юрин2
//    Петр Лыков1
//    Павел Чернов1
//    Петр Чернышов2
//    Мария Федорова1
//    Марина Светлова1
//    Мария Савина2
//    Мария Рыкова3
//    Марина Лугова2
//    Анна Владимирова3
//    Иван Мечников3
//    Петр Петин3
//    Иван Ежов4
//    Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по
//    убыванию популярности.
        repeatName();

    }

    private static void repeatName() {
        ArrayList<String> people = new ArrayList();
        people.add("Иван Иванов");
        people.add("Светлана Петрова");
        people.add("Кристина Белова");
        people.add("Анна Мусина");
        people.add("Анна Крутова");
        people.add("Иван Юрин");
        people.add("Петр Лыков");
        people.add("Павел Чернов");
        people.add("Петр Чернышов");
        people.add("Мария Федорова");
        people.add("Марина Светлова");
        people.add("Мария Савина");
        people.add("Мария Рыкова");
        people.add("Марина Лугова");
        people.add("Анна Владимирова");
        people.add("Иван Мечников");
        people.add("Петр Петин");
        people.add("Иван Ежов");

        Map<String, Integer> sameNames = new HashMap<>();

        for (String names : people) {
            String[] name = names.split("\\s");

            if (!sameNames.containsKey(name[0])) {
                sameNames.put(name[0], 0);
            }
            sameNames.put(name[0], sameNames.get(name[0]) + 1);
        }

        sameNames.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

    }
}





