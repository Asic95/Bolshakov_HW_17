package Lambda;

import java.util.Scanner;

public class Exercise_2 {

    public static class Lambda_2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String input1 = "";
            String input2 = "";

            Action2 operation = (str1, str2) -> {
                if (str1.length() > str2.length()) {
                    return str1;
                } else {
                    return str2;
                }
            };
            System.out.println("\n");
            System.out.println("Введення та пошук найдошої з двох введених строк");
            System.out.print("Введіть першу строку: ");
            input1 = in.nextLine();
            System.out.println();
            System.out.print("Введіть другу строку: ");
            input2 = in.nextLine();
            System.out.println("Найдовша строка: " + operation.longestStr(input1, input2));
        }
    }

    @FunctionalInterface
    interface Action2 {
        String longestStr(String str1, String str2);
    }
}
