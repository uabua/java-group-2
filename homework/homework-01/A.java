package com.company;

import java.util.Scanner;

/*
განსაზღვრეთ კლასი A: მთელი ტიპის x ცვლადით. კონსტრუქტორით, 3 მეთოდით.
 */
class A {
    static int x;

    /*
    ბეჭდავს „Hello“.
     */
    A() {
        System.out.println("Hello");
    }

    /*
    შეაქვს x ცვლადში მონაცემი კლავიატურიდან.
     */
    void methodOne() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ მთელი რიცხვი: ");
        x = scanner.nextInt();
    }

    /*
    ბეჭდავს x+12-ს.
     */
    void methodTwo() {
        System.out.println(String.format("%d + 12 = %d", x, x + 12));
    }

    /*
    ადგენს x ლუწია თუ კენტი.
     */
    void methodThree() {
        if (x % 2 == 0) {
            System.out.println(String.format("%d ლუწია.", x));
        } else {
            System.out.println(String.format("%d კენტია.", x));
        }
    }
}
