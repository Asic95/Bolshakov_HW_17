package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        int strCount = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("\n");
        System.out.print("Введіть кількість рядків, яку ви хочете ввести: ");
        strCount = in.nextInt();
        LinkedList<String> myStringList = new LinkedList<>();
        in.nextLine();
        System.out.println();
        for (int k = 1; k < strCount + 1; k++) {
            System.out.print("Введіть " + k +"-е значення: ");
            myStringList.addFirst(in.nextLine());
        }

        System.out.println();
        System.out.println("--- Виведення інформації ---");
        for (String str : myStringList) {
            System.out.println(str);            //виведення linkedList
        }
    }
}
