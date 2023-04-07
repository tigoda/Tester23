package HW_Java.hw3;

import java.util.ArrayList;
import java.util.Iterator;

public class hw3_4 {
    public static void main(String[] args) {
//        4*. Создать список типа ArrayList<String>.
//        Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
        listSorting();
    }

    private static void listSorting() {
        ArrayList<String> list = new ArrayList<>() {{
            add("1");
            add("2");
            add("aaa");
            add("346");
            add("0009");
            add("bbb");
            add("01");
        }};
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            String nextEl = listIterator.next();
            if (nextEl.matches("\\d+")) {
                listIterator.remove();
            }
        }
        System.out.println(list);
    }
}
