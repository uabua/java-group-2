package com.company;

import java.util.Random;
import java.util.Scanner;

/*
განსაზღვრეთ კლასი B: მთელი ტიპის ცვლადით a=33, ნამდვილი ტიპის ცვლადით b=9.7, სიმბოლური ტიპის ცვლადით s=’#’;
 */
class B {
    int a = 33;
    double b = 9.7;
    char s = '#';

    /*
    ბეჭდავს s ცვლადის მნიშვნელობას;
     */
    void methodOne() {
        System.out.println(String.format("s = %c", this.s));
    }

    /*
    ბეჭდავს a ცვლადის მნიშვნელობას;
     */
    void methodTwo() {
        System.out.println(String.format("a = %d", this.a));
    }

    /*
    ბეჭდავს b ცვლადის მნიშვნელობას;
     */
    void methodThree() {
        System.out.println(String.format("b = %f", this.b));
    }

    /*
    ბეჭდავს a და b ცვლადების სხვაობას;
     */
    void methodFour() {
        System.out.println(String.format("%d - %f = %f", this.a, this.b, this.a - this.b));
    }

    /*
    აბრუნებს a და b ცვლადების განაყოფს;
     */
    String methodFive() {
        try {
            return String.format("%d / %f = %f", this.a, this.b, this.a / this.b);
        } catch (ArithmeticException e) {
            return "You Shouldn't divide a number by zero. :)";
        }
    }

    /*
    ანიჭებს ცვლადებს სხვა ნებისმიერ შესაბამისი ტიპის მნიშვნელობას;
     */
    void methodSix() {
        Random random = new Random();
        this.a = random.nextInt();
        this.b = random.nextDouble();
        this.s = (char) (random.nextInt(26) + 'a');
    }

    /*
    ანიჭებს a ცვლადს მნიშვნელობას კლავიატურიდან;
     */
    void methodSeven() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ მთელი რიცხვი: ");
        this.a = scanner.nextInt();
    }

    /*
    ბეჭდავს b ცვლადზე 10-ით მეტ რიცხვს.
     */
    void methodEight() {
        System.out.println(String.format("%f + 10 = %f", this.b, this.b + 10));
    }

}
