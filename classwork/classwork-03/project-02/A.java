package com.company;

/*
განსაზღვრეთ კლასი: მთელი ტიპის x ცვლადით. კონსტრუქტორით, 1 მეთოდით.
 */
class A {
    int x = 1234;

    /*
    ბეჭდავს „hello My Class“;
     */
    A() {
        System.out.println("Hello My Class.");
    }

    /*
    ადგენს x ლუწია თუ კენტი;
     */
    void methodOne() {
        if (this.x % 2 == 0) {
            System.out.println(String.format("%d ლუწია.", this.x));
        } else {
            System.out.println(String.format("%d კენტია.", this.x));
        }
    }
}
