package Lambda;

import java.util.Scanner;

public class Exercise_4 {
    public static class Lambda_4 {
        public static void main(String[] args) {
            double num1 = 0;
            double num2 = 0;
            double num3 = 0;
            Scanner in = new Scanner(System.in);

            Action4 operation = (a, b, c) -> {
                double result = 0;
                result = a * Math.pow(b, c);
                return result;
            };

            System.out.println("\n");
            System.out.println("Розв'язок рівняння типу a*b^c");
            System.out.print("Введіть число a= ");
            num1 = in.nextDouble();
            System.out.print("Введіть число b= ");
            num2 = in.nextDouble();
            System.out.print("Введіть число c= ");
            num3 = in.nextDouble();
            System.out.print("a*b^c = " + operation.calculate(num1, num2, num3));
        }
    }

    @FunctionalInterface
    interface Action4 {
        double calculate(double a, double b, double c);
    }
}
