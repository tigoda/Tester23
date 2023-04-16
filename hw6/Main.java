package HW_Java.hw6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static String name;
    static String color;
    static int maxPrice;
    static int minPrice;
    static int back;


    public static void main(String[] args) {
        ArrayList<Notebook> list = new ArrayList<>();
        Notebook notebook1 = new Notebook("Apple MacBook Pro", "серый", 16.2, 32, 363000);
        list.add(notebook1);
        Notebook notebook2 = new Notebook("MSI Stealth", "черный", 17.3, 32, 325000);
        list.add(notebook2);
        Notebook notebook3 = new Notebook("ASUS ROG Zephyrus", "черный", 16.0, 16, 236000);
        list.add(notebook3);
        Notebook notebook4 = new Notebook("Apple MacBook Air", "золотой", 13.0, 16, 120000);
        list.add(notebook4);

        userInput(list);

    }

    private static void userInput(ArrayList<Notebook> list) {
        Scanner userChoiceScanner = new Scanner(System.in);
        System.out.print("Параметры для поиска:\n1 - бренд\n2 - цвет\n3 - цена\nВвод:");
        int userChoice = userChoiceScanner.nextInt();
        while (true) {
            if (userChoice == 1) {
                Scanner choiceNameScanner = new Scanner(System.in);
                System.out.print("Введите бренд ноутбука: \n");
                name = choiceNameScanner.nextLine();
                nameNotebook(list);

            }
            if (userChoice == 2) {
                Scanner choiceColorScanner = new Scanner(System.in);
                System.out.print("Введите цвет ноутбука: ");
                color = choiceColorScanner.nextLine();
                colorNotebook(list);
            }
            if (userChoice == 3) {
                Scanner choicePriceScannerMin = new Scanner(System.in);
                System.out.print("Введите минимальную цену ноутбука: ");
                minPrice = choicePriceScannerMin.nextInt();
                Scanner choicePriceScannerMax = new Scanner(System.in);
                System.out.print("Введите максимальную цену ноутбука: ");
                maxPrice = choicePriceScannerMax.nextInt();
                priceNotebook(list);
            }


        }

    }

    private static void comeBack() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("вернуться в первоначальное меню: Да/Нет ");
        String back = scanner.nextLine();
        while (true) {
            if (back.equals("Да".toLowerCase())) {
                userInput(new ArrayList<>());
            }
            if (back.equals("Нет".toLowerCase())) {
                break;
            }
            ;
        }
    }

    private static void nameNotebook(ArrayList<Notebook> list) {
        for (Notebook notebook : list) {
            if (notebook.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(notebook);

            }
        }
        comeBack();
    }

    private static void colorNotebook(ArrayList<Notebook> list) {
        for (Notebook notebook : list) {
            if (notebook.getColor().toLowerCase().contains(color.toLowerCase())) {
                System.out.println(notebook);
            }
        }
        comeBack();
    }

    private static void priceNotebook(ArrayList<Notebook> list) {
        for (Notebook notebook : list) {
            if (notebook.getPrice() >= minPrice & notebook.getPrice() <= maxPrice) {
                System.out.println(notebook);
            }
        }
        comeBack();
    }
}















