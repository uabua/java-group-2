package com.company;

import java.util.Scanner;

/*
განსაზღვრეთ კლასი C: ორი მთელი ტიპის ცვლადით a=10, b=9, ორი სიმბოლური ტიპის ცვლადით s=’#’, h=’@’;
 */
class C {
    int a = 10;
    int b = 9;
    char s = '#';
    char h = '@';

    /*
    ბეჭდავს მთელი ტიპის ცვლადების მნიშვნელობებს;
     */
    void methodOne() {
        System.out.println(String.format("a = %d\nb = %d", this.a, this.b));
    }

    /*
    ბეჭდავს სიმბოლური ტიპის ცვლადების მნიშვნელობებს;
     */
    void methodTwo() {
        System.out.println(String.format("s = %c\nh = %c", this.s, this.h));
    }

    /*
    ბეჭდავს a და b ცვლადების ჯამს, ნამრავლს, სხვაობას, ნაშთიან გაყოფას ცალ-ცალკე სტრიქონზე;
     */
    void methodThree() {
        System.out.println(String.format("%d + %d = %d", this.a, this.b, this.a + this.b));
        System.out.println(String.format("%d * %d = %d", this.a, this.b, this.a * this.b));
        System.out.println(String.format("%d - %d = %d", this.a, this.b, this.a - this.b));

        try {
            System.out.println(String.format("%d %% %d = %d", this.a, this.b, this.a % this.b));
        } catch (ArithmeticException e) {
            System.out.println("You Shouldn't divide a number by zero");
        }
    }

    /*
    ანიჭებს a ცვლადს მნიშვნელობას კლავიატურიდან;
     */
    void methodFour() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ მთელი რიცხვი: ");
        this.a = scanner.nextInt();
    }

    /*
    ანიჭებს b ცვლადს მნიშვნელობას კლავიატურიდან;
     */
    void methodFive() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ მთელი რიცხვი: ");
        this.b = scanner.nextInt();
    }

    /*
    ანიჭებს სიმბოლური ტიპის ცვლადებს მნიშვნელობებს კლავიატურიდან;
     */
    void methodSix() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ სიმბოლო: ");
        this.s = scanner.next().charAt(0);

        System.out.print("შეიყვანეთ სიმბოლო: ");
        this.h = scanner.next().charAt(0);
    }
}
