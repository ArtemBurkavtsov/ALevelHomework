public class Task2 {
    public static final String COLOR_RED = "\u001B[31m";
    public static final String COLOR_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        int number = 10;
        if ((number % 2) == 0) {
            System.out.println("число: " + number + COLOR_GREEN + " Четное");
        } else {
            System.out.println("число: " + number + COLOR_RED + " Нечетное");
        }
    }
}

