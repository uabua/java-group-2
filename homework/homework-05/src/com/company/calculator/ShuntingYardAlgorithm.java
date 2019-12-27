package com.company.calculator;

import java.util.*;

public class ShuntingYardAlgorithm {
    static Queue<String> infixNotation;

    static boolean isNumber(String token) {
        try {
            Double.valueOf(token);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    static Queue<String> transform(String[] infixNotation) {
        Map<String, Integer> precedence = new HashMap<>();
        precedence.put("^", 6);
        precedence.put("/", 5);
        precedence.put("*", 5);
        precedence.put("+", 4);
        precedence.put("-", 4);
        precedence.put("(", 0);

        Queue<String> q = new LinkedList<>();
        Stack<String> s = new Stack<>();

        for (String token : infixNotation) {
            if ("(".equals(token)) {
                s.push(token);

                continue;
            }

            if (")".equals(token)) {
                while (!"(".equals(s.peek())) {
                    q.add(s.pop());
                }

                s.pop();
                continue;
            }

            if (precedence.containsKey(token)) {
                while (!s.empty() && precedence.get(token) <= precedence.get(s.peek())) {
                    q.add(s.pop());
                }

                s.push(token);
                continue;
            }

            if (isNumber(token)) {
                q.add(token);
                continue;
            }

            throw new IllegalArgumentException("Error! Unsupported token detected.");
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        return q;
    }

    public static Queue<String> parse(String infixNotation) {
        try {
            ShuntingYardAlgorithm.infixNotation = transform(infixNotation.split(" "));
            return ShuntingYardAlgorithm.infixNotation;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ShuntingYardAlgorithm.infixNotation;
    }
}
