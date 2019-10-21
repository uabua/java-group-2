package com.company.task1;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
    }

    /*
    დაწერეთ პროგრამა, რომელიც y = x^2 + 2x + 3 ფუნქციის მნიშვნელობებს დაითვლის [1; 2] შუალედში მეასედების სიზუსტით და შესაბამის    მნიშვნელობებს ჩაწერს function.txt ფაილში.
     */
    private static void exerciseOne() {
        try {
            FileWriter fileWriter = new FileWriter("function.txt", true);

            for (double number = 1; number < 2.01; number += 0.01) {
                fileWriter.write(String.format("y = %.2f^2 + 2*%.2f + 3 = %.2f\n", number, number, Math.pow(number, 2) + number * 2 + 3));
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
