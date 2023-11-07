package Lambda;

import java.util.Scanner;

public class Exercise_3 {

    public static class Lambda_3 {
        public static void main(String[] args) {

            double a1 = 0;
            double b1 = 0;
            double c1 = 0;
            Scanner in = new Scanner(System.in);

            Action3 operation = (a, b, c) -> {

                double d1;
                double res1;
                double res2;
                String result = "";

                d1 = (b * b) - (4 * a * c);
                if (d1 < 0) {
                    result = "коренів немає";
                } else if (d1 == 0) {
                    res1 = (-b) / (2 * a);
                    result = "корені рівняння однакові. x1 = x2 = " + res1;
                } else if (d1 > 0) {
                    res1 = ((-b) + Math.sqrt(d1)) / (2 * a);
                    res2 = ((-b) - Math.sqrt(d1)) / (2 * a);
                    result = "корені рівняння різні. x1 = " + res1 + ", x2 = " + res2;
                }
                return result;
            };
            System.out.println("\n");
            System.out.println("Давайте розв'яжемо квадратне рівняння типу a*x^2+b*x+c=0. Для цього потрібно почергово ввести значення a,b,c.");
            while (a1 == 0) {
                System.out.print("Введіть значення a = ");
                a1 = in.nextDouble();
                if (a1 == 0) {
                    System.out.println("Значення не може дорівнювати 0. Спробуйте ще раз!");
                }
            }
            System.out.print("Введіть значення b = ");
            b1 = in.nextDouble();
            System.out.print("Введіть значення c = ");
            c1 = in.nextDouble();
            System.out.println("Результат: " + operation.math_solve(a1, b1, c1));
        }
    }

    @FunctionalInterface
    interface Action3 {
        String math_solve(double a, double b, double c);
    }
}
