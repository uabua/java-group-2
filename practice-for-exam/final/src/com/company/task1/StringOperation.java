package com.company.task1;

import java.util.ArrayList;
import java.util.Random;

public class StringOperation implements StringOperationInterface {
    ArrayList<String> randomStrings = new ArrayList<>();

    @Override
    public void writeToList() {
        int num = 0;
        while (num < 20) {
            String element = randomStringsGenerator('a', 'z');

            randomStrings.add(element);

            num++;
        }
    }

    String randomStringsGenerator(char start, char end) {
        String alphabet = "";
        String word = "";
        ArrayList<Integer> indexes = new ArrayList<>();

        Random random = new Random();

        for (int index = (int) start; index <= (int) end; index++) {
            alphabet += (char) index;
        }

        int num = 0;

        while (num < 7) {
            int randomIndex = random.nextInt(alphabet.length());

            if (!indexes.contains(randomIndex)) {
                word += alphabet.charAt(randomIndex);

                indexes.add(randomIndex);
                num++;
            }
        }

        return word;
    }

    @Override
    public void editString() {
        for (int i = 0; i < 20; i++) {
            if (this.randomStrings.get(i).contains("a")) {
                this.randomStrings.set(i, randomStringsGenerator('b', 'z'));
            }
        }
    }

    @Override
    public void addToList() {
        Random random = new Random();

        int randomIndex = random.nextInt(20);

        for (int i = 0; i < 5; i++) {
            randomStrings.add(randomIndex + 1, randomStringsGenerator('0', '9'));
        }
    }

    @Override
    public void printList() {
        System.out.println(this.randomStrings);
    }
}
