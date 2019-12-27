package com.company.calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/*
კონსოლური აპლიკაცია, რომელიც შეძლებს შეტანილი ტექსტის დაპარსვას (სტრინგის ანალიზს)
და სწორი მათემატიკური მოქმედებების შესრულებას.
მაგალითად:
შეგვაქვს ტექსტი: 2+32 აპლიკაცია დაწერს პასუხს 34,
შეგვაქვს ტექსტი: 2*(2+32) აპლიკაცია დაწერს პასუხს 68,
შეგვაქვს ტექსტი 3+7^2*3/(43-12) აპლიკაციამ დაწერს პასუხს 7.742
პასუხებს პროგრამა ჩაწერს file.txt ფაილში თარიღის მითითებით.

შარშან ალგორითმებში C-ზე გავიარეთ Reversed polish calculator-ისთვის ალგორითმი და კოდიც დავწერეთ.
ამიტომ ამ დავალებაშიც ზუსტად ეგ ალგორითმი გამოვოყენე.
 */
public class Calculator {
    String calculation;
    String input;
    String infixNotation;
    String[] postfixNotation;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate("2+32");
        calculator.calculate("2*(2+32)");
        calculator.calculate("3+7^2*3/(43-12)");
    }

    // ფაილში ჩაწერა
    static void writeToFile(String calculation) {
        Date date = new Date();

        try {
            FileWriter fileWriter = new FileWriter("data.txt", true);

            fileWriter.write(String.format("%s: %s\n", date, calculation));

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // გამოთვლა და ფაილში ჩაწერა
    public void calculate(String input) {
        this.input = input;

        infixNotation = InfixNotation.format(input);
        postfixNotation = ShuntingYardAlgorithm.parse(infixNotation).toArray(new String[]{});

        calculation = String.format("%s = %s", infixNotation, PostfixNotation.evaluate(postfixNotation));

        System.out.println(calculation);
        writeToFile(calculation);
    }
}