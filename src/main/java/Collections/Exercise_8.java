package Collections;

import java.util.*;

public class Exercise_8 {

    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("Виведення унікальних значень через Generic");

        dataEntering("Integer");
        dataEntering("String");
    }

    public static void dataEntering(String type) {
        Scanner in = new Scanner(System.in);
        switch (type) {
            case "Integer" -> {
                System.out.print("Введіть кількість int-цифр, яку ви хочете ввести: ");
                int numberCount = in.nextInt();
                System.out.print("Тепер введіть всі числа");
                System.out.println();
                List<Integer> myIntData = new ArrayList<>();
                for (int k = 0; k < numberCount; k++) {
                    myIntData.add(in.nextInt());
                }
                System.out.println("Унікальні int значення: " + removeDuplicates(myIntData));
                break;
            }
            case "String" -> {
                System.out.print("Введіть кількість рядків, яку ви хочете ввести: ");
                int numberCount = in.nextInt();
                in.nextLine();
                System.out.print("Тепер введіть всі рядки");
                System.out.println();
                String[] myStrData = new String[numberCount];
                for (int k = 0; k < numberCount; k++) {
                    myStrData[k] = in.nextLine();
                }
                System.out.println("Унікальні string значення: " + removeDuplicates(myStrData));
                break;
            }
        }
    }

    public static <T> Set<T> removeDuplicates(Collection<T> collection) {           // Приймаємо на вхід List
        Set<T> seenSet = new HashSet<>(collection);
        return seenSet;
    }

    public static <T> Set<T> removeDuplicates(T[] array) {                          // Overloading, приймаємо на вхід Array
        Set<T> seenSet = new HashSet<>(List.of(array));
        return seenSet;
    }

}