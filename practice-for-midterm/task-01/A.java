package com.company.task1;

import java.util.Arrays;
import java.util.Random;

/*
განსაზღვრეთ კლასი A: მთელი ტიპის m[15] მასივით; 4 მეთოდით; მეთოდი 1-ის იმპლემენტაციისთვის გამოიყენეთ ინტერფეისი.
 */
public class A implements InterfaceA {
    int[] m = new int[15];

    /*
    ანიჭებს m მასივის ელემენტებს შემთხვევით მნიშვნელობებს [a; b] შუალედიდან, a და b-ს მნიშვნელობების შეტანა ხდება კლავიატურიდან;
     */
    @Override
    public void methodOne(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            m[i] = randomNumber;
        }

        // System.out.println(Arrays.toString(m));
    }

    /*
    აბრუნებს მასივის იმ ელემენტების მნიშვნელობათა ჯამს, რომლის მნიშვნელობა თავის ინდექსზე ნაკლებია;
     */
    String methodTwo() {
        int total = 0;

        for (int i = 0; i < 15; i++) {
            if (i > m[i]) {
                total += m[i];
            }
        }

        return String.format("ისეთი ელემენტების, რომლის მნიშვნელობაც თავის ინდექსზე ნაკლებია, ჯამია: %d", total);
    }

    /*
    აბრუნებს მასივის იმ ელემენტების ნამრავლს, რომლის მნიშვნელობა თავის ინდექსზე მეტია;
     */
    String methodThree() {
        int product = 1;
        int count = 0; // ისეთი ელემენტების დასათვლელად, რომელთა მნიშვნელობაც ინდექსზე მეტია

        for (int i = 0; i < 15; i++) {
            if (i < m[i]) {
                product *= m[i];
                count++;
            }
        }

        if (count > 0) {
            return String.format("ისეთი ელემენტების, რომლის მნიშვნელობაც თავის ინდექსზე მეტია, ნამრავლია: %d", product);
        } else {
            return "არ მოიძებნა ისეთი ელემენტი, რომლის მნიშვნელობაც თავის ინდექსზე მეტია.";
        }
    }

    /*
    ბეჭდავს მასივში არსებულ ლუწ რიცხვებს.
     */
    void methodFour() {
        System.out.print("მასივში არსებული ლუწი ელემენტებია: ");

        for (int even : m) {
            if (even % 2 == 0) {
                System.out.print(String.format("%d ", even));
            }
        }
    }
}
