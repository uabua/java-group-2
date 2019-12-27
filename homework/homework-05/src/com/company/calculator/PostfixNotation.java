package com.company.calculator;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class PostfixNotation {
    static Double calculate(Double left, Double right, String operator) {
        if ("+".equals(operator)) {
            return left + right;
        }

        if ("-".equals(operator)) {
            return left - right;
        }

        if ("*".equals(operator)) {
            return left * right;
        }

        if ("/".equals(operator)) {
            return left / right;
        }

        if ("^".equals(operator)) {
            return Math.pow(left, right);
        }

        throw new IllegalArgumentException("Error! Unsupported token detected.");
    }

    static Double evaluate(String[] tokens) {
        Stack<Double> stack = new Stack<>();

        Set<String> operators = new HashSet<>() {{
            add("+");
            add("-");
            add("*");
            add("/");
            add("^");
        }};

        for (String token : tokens) {
            if (operators.contains(token)) {
                Double right = stack.pop();
                Double left = stack.pop();

                stack.push(calculate(left, right, token));
            } else {
                stack.push(Double.valueOf(token));
            }
        }

        return stack.pop();
    }
}
