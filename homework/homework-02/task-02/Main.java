package com.company.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exerciseTwo();
    }

    /*
    დაწერეთ პროგრამა, რომელიც function.txt ფაილიდან (იხილეთ ამოცანა 1)წაიკითხავს მონაცემებს და დაბეჭდავს
    მნიშვნელობებს შორის მინიმალურს და მაქსიმალურს.
     */
    private static void exerciseTwo() {
        List<Double> values = new ArrayList<>(); // წაკითხვის შემდეგ ფუნქციის მნიშვნელობების შესანახად
        String line;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("function.txt"));

            // ფაილიდან მხოლოდ ფუნქციის მნიშვნელობის (საბოლოო double-ის) ამოღება
            while ((line = bufferedReader.readLine()) != null) {
                values.add(Double.parseDouble(line.substring(line.lastIndexOf(" ") + 1)));
            }

            System.out.println(String.format("მინიმალური მნიშვნელობაა: %.2f", Collections.min(values)));
            System.out.println(String.format("მაქსიმალური მნიშვნელობაა: %.2f", Collections.max(values)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
