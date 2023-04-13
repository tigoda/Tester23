package HW_Java.hw4;

import java.util.Iterator;
import java.util.LinkedList;

public class hw4_2 {
    public static void main(String[] args) {
//        2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        flipList();
    }

    private static void flipList() {
        LinkedList<String> list = new LinkedList<>() {{
            add("1");
            add("2");
            add("3");
            add("4");
            add("5");
        }};
        LinkedList<String> listFlip = new LinkedList<>();

        for (String el : list) {
            listFlip.addFirst(el);
        }
        System.out.println(listFlip);
    }
}