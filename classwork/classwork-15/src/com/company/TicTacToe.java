package com.company;

import java.util.Random;

public class TicTacToe {
    char[][] table;
    char symbolX = 'X';
    char symbolO = 'O';

    TicTacToe() {
        this.table = new char[3][3];
        createTable();
    }

    void createTable() {
        char symbol = '1';

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                table[row][column] = symbol;
                symbol++;
            }
        }
    }

    void printTable() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(String.format("(%c)", this.table[row][column]));
            }

            System.out.println();
        }
    }

    // მომხმარებლისთვის
    void editTable(char num) {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (this.table[row][column] == num) {
                    this.table[row][column] = symbolX;
                }
            }
        }
    }

    // კომპიუტერისთვის
    void editTable() {
        Random random = new Random();
        int row = random.nextInt(3);
        int column = random.nextInt(3);

        this.table[row][column] = this.symbolO;
    }

    // სტრიქონებში მოგების შემთხვევაში
    boolean winRow() {
        for (int row = 0; row < 3; row++) {
            if (this.table[row][0] == this.table[row][1] && this.table[row][0] == this.table[row][2]) {
                return true;
            }
        }

        return  false;
    }

    // სვეტებში მოგების შემთხვევაში
    boolean winColumn() {
        for (int column = 0; column < 3; column++) {
            if (this.table[0][column] == this.table[1][column] && this.table[0][column] == this.table[2][column]) {
                return true;
            }
        }

        return  false;
    }

    // დიაგონალზე მოგების შემთხვევაში
    boolean winDiagonal() {
        if (this.table[0][0] == this.table[1][1] && this.table[0][0] == this.table[2][2]) {
            return true;
        } else if (this.table[0][2] == this.table[1][1] && this.table[0][0] == this.table[2][0]) {
            return true;
        } else {
            return false;
        }
    }
}
