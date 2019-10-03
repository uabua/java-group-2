package com.company;

import java.util.Random;
import java.util.Scanner;

/*
განსაზღვრეთ კლასი A: მთელი ტიპის m[10] მასივით; 4 მეთოდით;
 */
class A {
    int[] m = new int[10];

    /*
    ანიჭებს m მასივის ელემენტებს მნიშვნელობებს კლავიატურიდან.
     */
    void methodOne() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("შეიყვანე მთელი რიცხვი: ");
            int num = scanner.nextInt();
            m[i] = num;
        }
    }

    /*
    ანიჭებს m მასივის ელემენტებს შემთხვევით მნიშვნელობებს [0;15] შუალედუდან.
     */
    void methodTwo() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(16);
            m[i] = randomNum;
        }
    }

    /*
    გვიბრუნებს იმ ელემენტების მნიშვნელობათა ჯამს, რომლის მნიშვნელობა თავის ინდექსზე ნაკლებია.
     */
    int methodThree() {
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            if (m[i] < i) {
                sum = sum + m[i];
            }
        }

        return sum;
    }

    /*
    გვიბრუნებს იმ ელემენტების ინდექსების ნამრავლს, რომლის მნიშვნელობა თავის ინდექსზე მეტია.
     */
    int methodFour() {
        int mult = 1;
        int count = 0; // ისეთი ელემენტების დასათვლელად, რომელთა მნიშვნელობაც ინდექსზე მეტია

        for (int i = 0; i < 10; i++) {
            if (m[i] > i) {
                mult = mult * i;
                count++;
            }
        }

        if (count > 0) {
            return mult;
        } else {
            return -1; // იმ შემთხვევაში თუ არ მოიძებნება ელემენტი, რომლის მნიშცნელობაც მეტია საკუთარ ინდექსზე
        }
    }

}
