package com.company.task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ სამნიშნა რიცხვი: ");
        String number = scanner.nextLine();

        for (int i = 0; i <3; i++) {
            writeRandomNumberToFile(number);
        }
    }

    static void writeRandomNumberToFile(String number) {
        Random random = new Random();
        String randomNumber = "";

        try {
            FileWriter fileWriter = new FileWriter("random_numbers.txt", true);

            for (int i = 0; i < 3; i++) {
                randomNumber += number.charAt(random.nextInt(3));

                fileWriter.write(String.format("%s\n", randomNumber));

            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
