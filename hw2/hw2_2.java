package HW_Java.hw2;

import java.io.FileWriter;


public class hw2_2 {
    public static void main(String[] args) {

//        Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который
//        запишет эту строку в простой текстовый файл, обработайте исключения.
        System.out.println(text());
        writeFile();
    }

    private static StringBuilder text() {
        return new StringBuilder("TEST".repeat(100));

    }

    private static void writeFile() {
        try (FileWriter writer = new FileWriter
                ("HW_Java/hw2/hw2_2.txt")) {
            writer.write(String.valueOf(text()));
        } catch (Exception ignored) {

        }


    }
}

