package HW_Java.hw6;
//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков (ArrayList).
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. Например, спросить у
// пользователя минимальный размер оперативной памяти или конкретный цвет. Выводить только те ноутбуки,
// что соответствуют условию


public class Notebook {
    String name;
    String color;
    Double inch;
    int ram;
    int price;



    public Notebook(String name, String color, Double inch, int ram, int price) {
        this.name = name;
        this.color =color;
        this.inch = inch;
        this.ram=ram;
        this.price=price;

    }

    @Override
    public String toString() {

        return String.format("Название: %s, Цвет: %s, Монитор: %s, Оперативная память: %dгб, Цена: %d руб."
                ,name, color, inch, ram,price);
    }


    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }
}
