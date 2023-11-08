package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise_5 {
    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();
        Scanner in = new Scanner(System.in);
        int numberCount;

        System.out.println("\n");
        System.out.println("Фільтрування унікальних int значень");
        System.out.print("Введіть кількість цифр, яку ви хочете ввести: ");
        numberCount = in.nextInt();
        System.out.print("Тепер введіть всі числа");
        System.out.println();
        for (int k = 0; k < numberCount; k++) {
            integerSet.add(in.nextInt());
        }
        System.out.println("Відфільтровані унікальні значення: " + integerSet);
    }
}
