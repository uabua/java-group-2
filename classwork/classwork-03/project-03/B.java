package com.company;

import java.util.Random;
import java.util.Scanner;

/*
განსაზღვრეთ კლასი B: ნამდვილი ტიპის m[12] მასივით; 4 მეთოდით;
 */
class B {
    int[] m = new int[12];

    /*
    ანიჭებს m მასივის ელემენტებს მნიშვნელობებს კლავიატურიდან.
     */
    void methodOne() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            System.out.print("შეიყვანე მთელი რიცხვი: ");
            int num = scanner.nextInt();
            m[i] = num;
        }
    }

    /*
    ანიჭებს m მასივის ელემენტებს შემთხვევით მნიშვნელობებს [0; 15] შუალედიდან.
     */
    void methodTwo() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(16);
            m[i] = randomNum;
        }
    }

    /*
    ბეჭდავს მასივის იმ ელემენტების მნიშვნელობებს შესაბამისი ინდექსებით, რომელთა მნიშვნელობებიც მეტია 7-ზე.
     */
    void methodThree() {
        for (int i = 0; i < 12; i++) {
            if (m[i] > 7) {
                System.out.println(String.format("ინდექსი: %d\nელემენტის მნიშვნელობა: %d", i, m[i]));
            }
        }
    }

    /*
    გვიბრუნებს მასივის უდიდესი და უმცირესი ელემენტების სხვაობას(გაბნევის დიაპაზონს).
     */
    int methodFour() {
        int max = m[0];
        int min = m[0];

        for (int num : m) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }
}
