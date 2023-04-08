package HW_Java.hw3;

import java.util.*;

public class hw3_3 {
    public static void main(String[] args) {
//      3. Доделать начатое на семинаре. Пройтись по списку из задания 2 и удалить повторяющиеся элементы.

        String[] arrPlanet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto"};
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(arrPlanet[random.nextInt(9)]);
        }
        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        System.out.println(list);
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
            } else {
                sb.append(list.get(i))
                        .append(": ")
                        .append(count)
                        .append("; ");
                count = 1;
            }
        }
        sb.append(list.get(list.size() - 1)).append(": ").append(count).append(".");
        System.out.println(sb);
        Set<String> sortList = new LinkedHashSet<>(list);
        System.out.println(sortList);

    }
}

