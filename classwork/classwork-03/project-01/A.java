package com.company;

import java.util.Scanner;

/*
განსაზღვრეთ კლასი A: ორი მთელი ტიპის ცვლადით a, b; 3 მეთოდით.
 */
class A {
    int a, b;

    /*
    ანიჭებს a და b ცვლადებს მნიშვნელობებს კლავიატურიდან.
     */
    void methodOne() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ მთელი რიცხვი: ");
        a = scanner.nextInt();

        System.out.print("შეიყვანეთ მთელი რიცხვი: ");
        b = scanner.nextInt();
    }

    /*
    დაბეჭდოს ცვლადების ჯამი.
     */
    void methodTwo() {
        System.out.println(String.format("%d + %d = %d", a, b, a + b));
    }

    /*
    დაგვიბრუნოს ცვლადების ნამრავლი.
     */
    String methodThree() {
        return String.format("%d * %d = %d", a, b, a * b);
    }
}
