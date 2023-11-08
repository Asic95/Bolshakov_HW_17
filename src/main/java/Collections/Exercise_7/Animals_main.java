package Collections.Exercise_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Animals_main {
    public static void main(String[] args) {
        Map<String, Pet> myAnimals;
        Scanner in = new Scanner(System.in);
        int animalCount = 0;

        System.out.println("\n");
        System.out.print("Введіть кількість тварин n для заповнення, де Animals = (n x Cat, n x Dog, n x Parrot): ");
        animalCount = in.nextInt();

        myAnimals = addingAnimals(animalCount);

        System.out.println("\n");
        System.out.println("--- Виведення інформації ---");
        printAnimalsData(myAnimals);
    }

    public static Map<String, Pet> addingAnimals(Integer animalCount) {
        Scanner in = new Scanner(System.in);
        String animalName = "";
        Map<String, Pet> myAnimals = new HashMap<>();

        for (int k = 1; k < animalCount + 1; k++) {
            Cat cat = new Cat();
            System.out.print("Введіть назву " + k + "-го кота: ");
            animalName = in.nextLine();
            System.out.print("Введіть колір " + k + "-го кота: ");
            cat.setColour(in.nextLine());
            System.out.print("Введіть вагу " + k + "-го кота: ");
            cat.setWeight(in.nextFloat());
            in.nextLine();                         // Consume newline left-over
            myAnimals.put(animalName, cat);
        }
        System.out.println();
        for (int k = 1; k < animalCount + 1; k++) {
            Dog dog = new Dog();
            System.out.print("Введіть назву " + k + "-го собаки: ");
            animalName = in.nextLine();
            System.out.print("Введіть колір " + k + "-го собаки: ");
            dog.setColour(in.nextLine());
            System.out.print("Введіть вагу " + k + "-го собаки: ");
            dog.setWeight(in.nextFloat());
            in.nextLine();                         // Consume newline left-over
            myAnimals.put(animalName, dog);
        }
        System.out.println();
        for (int k = 1; k < animalCount + 1; k++) {
            Parrot parrot = new Parrot();
            System.out.print("Введіть назву " + k + "-го папуги: ");
            animalName = in.nextLine();
            System.out.print("Введіть колір " + k + "-го папуги: ");
            parrot.setColour(in.nextLine());
            System.out.print("Введіть вагу " + k + "-го папуги: ");
            parrot.setWeight(in.nextFloat());
            in.nextLine();                         // Consume newline left-over
            myAnimals.put(animalName, parrot);
        }
        return myAnimals;
    }

    public static void printAnimalsData(Map<String, Pet> myAnimals) {
        System.out.print("Назви тварини + характеристики: ");
        int k = 0;
        for (Map.Entry<String, Pet> Animals : myAnimals.entrySet()) {
            k++;
            if (k == myAnimals.size()) {
                System.out.print(Animals + "");
            } else {
                System.out.print(Animals + ", ");
            }
        }
        System.out.println();
    }
}

