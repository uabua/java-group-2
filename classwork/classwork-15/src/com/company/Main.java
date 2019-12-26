package com.company;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    TicTacToe ticTacToe = new TicTacToe();

	    ticTacToe.printTable();

	    while (true) {
            System.out.print("ციფრი:" );
            char num = scanner.next().charAt(0);

            ticTacToe.editTable(num);
            ticTacToe.printTable();
            ticTacToe.editTable();
            ticTacToe.printTable();

            if (ticTacToe.winRow() || ticTacToe.winColumn() || ticTacToe.winDiagonal()) {

            }
        }
    }
}
