package Lambda;

import java.util.Scanner;

public class Exercise_1 {

    public static class Lambda_1 {
        public static void main(String[] args) {
            int yourNumber;
            Scanner in = new Scanner(System.in);

            Action1 operation = (a, b) -> a % b == 0;
            System.out.println("\n");
            System.out.println("Перевірка чи ділиться введене число на 13 без остачі ");
            System.out.print("Введіть число: ");
            yourNumber = in.nextInt();
            System.out.println("Результат: " + operation.calculate(yourNumber, 13));
        }
    }

    @FunctionalInterface
    interface Action1 {
        boolean calculate(int a, int b);
    }
}