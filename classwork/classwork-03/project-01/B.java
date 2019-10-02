package com.company;

import java.util.Scanner;

/*
განსაზღვრეთ კლასი B: სამი მთელი ტიპის ცვლადით a, b, c; 3 მეთოდით.
 */
class B {
    int a, b, c;

    /*
    ანიჭებს a, b და c ცვლადებს მნიშვნელობებს კლავიატურიდან.
     */
    void methodOne() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ მთელი რიცხვი: ");
        a = scanner.nextInt();

        System.out.print("შეიყვანეთ მთელი რიცხვი: ");
        b = scanner.nextInt();

        System.out.print("შეიყვანეთ მთელი რიცხვი: ");
        c = scanner.nextInt();
    }

    /*
    ბეჭდავს ცვლადებს შორის მაქსიმალურს.
     */
    void methodTwo() {
        int[] numbers = {a, b, c};
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println(String.format("მაქსიმალური: %d", max));
    }

    /*
    გვიბრუნებს ცვლადებს შორის მინიმალურს.
     */
    String methodThree() {
        int[] numbers = {a, b, c};
        int min = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        return String.format("მინიმალურია: %d", min);
    }
}
