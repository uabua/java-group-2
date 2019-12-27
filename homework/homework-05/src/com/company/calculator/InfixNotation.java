package com.company.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InfixNotation {
    static StringBuilder infixNotation;
    static String regex = "(\\d+|[+\\-/*^()])";

    static String format(String input) {
        infixNotation = new StringBuilder();
        input = input.strip().replace(" ", "");

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            infixNotation.append(String.format("%s ", matcher.group()));
        }

        return infixNotation.toString().strip();
    }
}
