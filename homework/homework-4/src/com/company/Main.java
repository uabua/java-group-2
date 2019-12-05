package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input language must be 'en', 'ge' or 'ru'. Other inputs will count as 'en'.");

        System.out.print("Input language: ");
        String language = scanner.nextLine();

        System.out.println("Input parameters must be '^p-*\\d+-+\\d+-*s-*\\d+-+\\d+-*w-*\\d+-+\\d*+$', that means you must start your input with 'p' and end with a number. You must input 'p', 's', 'w' characters and at least 1 number. Between the numbers you must use '-'. If you want special sized sentence or word, you must write same numbers(for example, 'p-2-2').\nI know, it's hard, but RULES are RULES!");

        System.out.print("Input parameters: ");
        String parameters = scanner.nextLine();

        Generator generator = new Generator(language, parameters);
        System.out.println(generator.paragraphGenerator());

    }
}
