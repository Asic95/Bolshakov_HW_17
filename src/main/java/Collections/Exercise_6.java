package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Map<String, Toys> shopAssortment;
        Scanner in = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Вас вітає магазин іграшок");
        System.out.print("Введіть кількість іграшок, яку б ви хотіли додати до бази даних: ");
        shopAssortment = toysAdding(in.nextInt());

        System.out.println("\n");
        System.out.println("--- Виведення інформації ---");
        printKeys(shopAssortment);
        printValues(shopAssortment);
        printPairs(shopAssortment);

    }

    public static class Toys implements Comparable<Toys> {

        public String toyCategory;
        public int toyPrice;

        public void setToyCategory(String toyCategory) {
            this.toyCategory = toyCategory;
        }

        public void setToyPrice(int toyPrice) {
            this.toyPrice = toyPrice;
        }

        @Override
        public String toString() {
            return "{" +
                    "Category = " + toyCategory +
                    ", Price = " + toyPrice +
                    '}';
        }

        @Override
        public int compareTo(Toys o) {
            return 0;
        }
    }

    public static Map<String, Toys> toysAdding(Integer toysNumber) {
        String toyName = "";
        Scanner in = new Scanner(System.in);
        Map<String, Toys> toy = new HashMap<>(toysNumber);

        System.out.println("Почнемо заповнювати інформацію");

        for (int k = 1; k < toysNumber + 1; k++) {
            Toys characteristics = new Toys();
            System.out.print("Введіть назву іграшки #" + k + ": ");
            toyName = in.nextLine();
            System.out.print("Введіть категорію іграшки #" + k + ": ");
            characteristics.setToyCategory(in.nextLine());
            System.out.print("Введіть ціну іграшки #" + k + ": ");
            characteristics.setToyPrice(in.nextInt());
            in.nextLine();                         // Consume newline left-over - https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
            toy.put(toyName, characteristics);
        }
        return toy;
    }

    public static void printPairs(Map<String, Toys> shopAssortment) {
        System.out.print("Назви іграшок + характеристики: ");
        int k = 0;
        for (Map.Entry<String, Toys> ourToys : shopAssortment.entrySet()) {
            k++;
            if (k == shopAssortment.size()) {
                System.out.print(ourToys + "");
            } else {
                System.out.print(ourToys + ", ");
            }
        }
        System.out.println();
    }

    public static void printKeys(Map<String, Toys> shopAssortment) {
        System.out.print("Назви іграшок: ");
        int k = 0;
        for (Map.Entry<String, Toys> ourToys : shopAssortment.entrySet()) {
            k++;
            if (k == shopAssortment.size()) {
                System.out.print(ourToys.getKey() + "");
            } else {
                System.out.print(ourToys.getKey() + ", ");
            }
        }
        System.out.println();
    }

    public static void printValues(Map<String, Toys> shopAssortment) {
        System.out.print("Характеристики іграшок: ");
        int k = 0;
        for (Map.Entry<String, Toys> ourToys : shopAssortment.entrySet()) {
            k++;
            if (k == shopAssortment.size()) {
                System.out.print(ourToys.getValue() + "");
            } else {
                System.out.print(ourToys.getValue() + ", ");
            }
        }
        System.out.println();
    }
}
