package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        int strCount = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("\n");
        System.out.print("Введіть кількість рядків, яку ви хочете ввести: ");
        strCount = in.nextInt();
        in.nextLine();
        for (int k = 1; k < strCount + 1; k++) {
            System.out.print("Введіть " + k + "-е значення: ");
            myList.add(in.nextLine());
        }
        maxLength(myList);
    }

    public static void maxLength(ArrayList<String> myList) {

        int tempValue;
        ArrayList<Integer> indexes2 = new ArrayList<>();
        tempValue = myList.get(0).length();
        indexes2.add(0);

        for (int k = 0; k < myList.size() - 1; k++) {
            if (myList.get(k + 1).length() > tempValue) {
                tempValue = myList.get(k + 1).length();
                indexes2.clear();
                indexes2.add(k + 1);
            } else if (myList.get(k + 1).length() == tempValue) {
                indexes2.add(k + 1);
            }
        }
        System.out.println();
        System.out.println("--- Виведення найдовших рядків ---");
        for (int index : indexes2) {
            System.out.println(myList.get(index));
        }
    }
}
