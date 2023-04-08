package HW_Java.hw2;
import java.io.File;
import java.util.*;

public class hw2_3 {
    public static void main(String[] args) {
//        3*.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль
//        результат вида:
//        1 Расширение файла: txt
//        2 Расширение файла: pdf
//        3 Расширение файла:
//        4 Расширение файла: jpg
        fileExtension();
    }

    private static void fileExtension() {

        File dir = new File(".idea");
        ArrayList<String> lst = new ArrayList<>(List.of(Objects.requireNonNull(dir.list())));
        for (String s : lst) {
            List<String> l = Arrays.asList(s.split("\\."));
            for (int i = 0; i < l.size(); i++) {
                if (i == 1) {
                    System.out.printf("Расширение файла: %s \n", l.get(1) );
                }
            }
        }
    }
}