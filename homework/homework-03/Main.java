package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        methodOne();
        methodTwo();
    }

    /*
     ჩაწერეთ კოლექციაში თორმეტი შემთხვევითი მთელი რიცხვი. წაშალეთ ლუწ
     ინდექსიანი ელემენტები. დაბეჭდეთ თავდაპირველი და მიღებული კოლექცია
     ზრდადობით.
     */
    private static void methodOne() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        Random random = new Random();

        for (int index = 0, min = -100, max = 100, size = 12; index < size; index++) {
            linkedList.add(random.nextInt(max - min + 1) + min);
        }

        System.out.println(String.format("Original: %s", linkedList));

        LinkedList<Integer> preservedLinkedList = new LinkedList<>(linkedList);

        for (int index = 0, size = linkedList.size(); index < size; index++, size--) {
            linkedList.remove(index);
        }

        System.out.println(String.format("Edited: %s", linkedList));

        Collections.sort(preservedLinkedList);
        System.out.println(String.format("Original (sorted): %s", preservedLinkedList));

        Collections.sort(linkedList);
        System.out.println(String.format("Edited (sorted): %s", linkedList));
    }

    /*
     ჩაწერეთ კოლექციაში თორმეტი შემთხვევითი მთელი რიცხვი [5, 10] შუალე-
     დიდან. დაამატეთ ასევე შემთხვევითი რიცხვები ყოველი სამის ჯერადი ინდექსის
     შემდეგ [20, 25] შუალედიდან. დაბეჭდეთ თავდაპირველი და მიღებული კოლექ-
     ცია.
     */
    private static void methodTwo() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        Random random = new Random();

        for (int index = 0, min = 5, max = 10, size = 12; index < size; index++) {
            linkedList.add(random.nextInt(max - min + 1) + min);
        }

        System.out.println(String.format("Original: %s", linkedList));

        for (int index = 0, min = 20, max = 25; index < linkedList.size(); index += 4) {
            int randomInteger = random.nextInt(max - min + 1) + min;

            linkedList.add(index + 1, randomInteger);
        }

        System.out.println(String.format("Edited: %s", linkedList));
    }
}
