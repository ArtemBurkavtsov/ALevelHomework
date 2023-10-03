public class Task3 {
    public static void main(String[] args) {
        //Модульные числа
        double num1 = 4.15;
        double num2 = 3.18;
        double num3 = 1.12;
        double MinNum = FindMinNum(num1, num2, num3);
        System.out.println("Меньшее по модулю число: " + MinNum);
    }

    public static double FindMinNum(double num1, double num2, double num3) {
        double CompNum1 = Math.abs(num1);
        double CompNum2 = Math.abs(num2);
        double CompNum3 = Math.abs(num3);

        double MinCompNum = (CompNum1 <= CompNum2 && CompNum1 <= CompNum3) ? num1 :
                            (CompNum2 <= CompNum1 && CompNum2 <= CompNum3) ? num2:num3 ;
        return MinCompNum;
    }
}