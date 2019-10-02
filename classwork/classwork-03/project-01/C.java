package com.company;

import java.util.Scanner;

/*
განსაზღვრეთ კლასი C: სამი მთელი ტიპის ცვლადით a, b, c; 6 მეთოდით.
 */
class C {
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
    აბრუნებს a-ს მნიშვნელობის ბოლო ციფრს
     */
    int methodTwo() {
        return a % 10;
    }

    /*
    აბრუნებს b-ს მნიშვნელობის პირველ ციფრს.
     */
    int methodThree() {
        while (b >= 10) {
            b = b / 10;
        }

        return b;
    }

    /*
    აბრუნებს c-ს მნიშვნელობის ციფრთა ჯამს.
     */
    int methodFour() {
        int sum = 0;

        c = Math.abs(c);

        while (c > 0) {
            sum = sum + (c % 10);
            c = c / 10;
        }

        return sum;
    }

    /*
    ბეჭდავს მეთოდი 2-ის მნიშნველობისა და მეთოდი 3-ის მნიშვნელობის ნამრავლს.
     */
    void methodFive() {
        System.out.println(String.format("%d * %d = %d", methodTwo(), methodThree(), methodTwo() * methodThree()));
    }

    /*
    ბეჭდავს მეთოდი 3-ის მნიშნველობისა და მეთოდი 5-ის მნიშვნელობის ჯამს.
     */
    void methodSix() {
        System.out.println(String.format("%d + %d = %d", methodThree(), methodTwo() * methodThree(), methodThree() + (methodTwo() * methodThree())));
    }
}