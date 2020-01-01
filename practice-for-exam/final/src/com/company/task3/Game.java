package com.company.task3;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int gel = 100;
    int[][] table;
    int[] sumOfRowsAndTables;
    String userInput;

    Game() {
        Scanner scanner = new Scanner(System.in);

        while (this.gel > 0) {
            makeTable();
            printTable();
            getSum();

            if (win()) {
                System.out.println("გილოცავ 5 ლარი მოიგე!");
            } else {
                System.out.println("სამწუხაროდ 5 ლარი წააგე...");
            }

            System.out.print("თამაში გაგრძელება - Y, შეწყვეტა - N: ");
            this.userInput = scanner.nextLine();

            if (this.userInput.equals("N")) {
                break;
            }

        }

    }

    void makeTable() {
        Random random = new Random();
        this.table = new int[5][3];

        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 3; column++) {
                this.table[row][column] = random.nextInt(5) - 2;
            }
        }
    }

    void printTable() {
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(String.format("(%d)", this.table[row][column]));
            }
            System.out.println();
        }
    }

    void getSum() {
        this.sumOfRowsAndTables = new int[8];
        int index = 0;

        for (int row = 0; row < 5; row++) {
            int total = 0;

            for (int column = 0; column < 3; column++) {
                total += this.table[row][column];
            }

            sumOfRowsAndTables[index] = total;
            index++;
        }

        for (int column = 0; column < 3; column++) {
            int total = 0;

            for (int row = 0; row < 5; row++) {
                total += this.table[row][column];
            }

            sumOfRowsAndTables[index] = total;
            index++;
        }
    }

    boolean win() {
        int count = 0;

        for (int i = 0; i < this.sumOfRowsAndTables.length; i++) {
            if (this.sumOfRowsAndTables[i] > 0) {
                count++;
            }
        }

        if (count > 4) {
            this.gel += 5;
            return true;
        } else {
            this.gel -= 5;
            return false;
        }
    }
}
