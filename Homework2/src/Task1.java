public class Task1 {
    //Цвета
    public static final String COLOR_RED = "\u001B[31m";
    public static final String COLOR_GREEN = "\u001B[32m";
    public static final String COLOR_WHITE = "\u001B[37m";
    public static final String COLOR_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
    //Данные
        double xA = 1;
        double yA = 5;
        double xB = 3;
        double yB = 5;
        double xC = 6;
        double yC = 7;
        System.out.println(COLOR_RED+"Данны координаты: "+COLOR_WHITE+"A(1, 5), B(3, 5), C(6, 7)");
        //Формула
        System.out.println(COLOR_YELLOW+"Будем использовать формулу Герона");

        //Cначала посмотрим на длину данных сторон
        double sideAB = Math.sqrt(Math.pow(xB-xA, 2) + Math.pow(yB-yA, 2));
        double sideBC = Math.sqrt(Math.pow(xC-xB, 2) + Math.pow(yC-yB, 2));
        double sideCA = Math.sqrt(Math.pow(xA-xC, 2) + Math.pow(yA-yB, 2));

        //Определим полупериметр
        double SemiPerimetr = (sideAB+sideBC+sideCA) /2;

        //Ну и сама формула Герона
        double Geron = Math.sqrt(SemiPerimetr*(SemiPerimetr-sideAB)*(SemiPerimetr-sideBC)*(SemiPerimetr-sideCA));
        System.out.println(COLOR_GREEN+"Результат: "+COLOR_WHITE+Geron);
    }
}
