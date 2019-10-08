package com.company;

/*
განსაზღვრეთ კლასი A: ორი მთელი ტიპის ცვლადით a=10, b=29;
 */
class A {
    int a = 10;
    int b = 29;

    /*
    ბეჭდავს “Hello OOP”;
     */
    void methodOne() {
        System.out.println("Hello OOP!");
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
        System.out.println(String.format("b = %d", this.b));
    }

    /*
    ბეჭდავს a და b ცვლადების ჯამს;
     */
    void methodFour() {
        System.out.println(String.format("%d + %d = %d", this.a, this.b, this.a + this.b));
    }

    /*
    აბრუნებს a და b ცვლადების ჯამს;
     */
    String methodFive() {
        return String.format("%d + %d = %d", this.a, this.b, this.a + this.b);
    }

    /*
    აბრუნებს a და b ცვლადების ნამრავლს;
     */
    String methodSix() {
        return String.format("%d * %d = %d", this.a, this.b, this.a * this.b);
    }

    /*
    ანიჭებს a და b ცვლადებს 5-ის და 6-ის ტოლ მნიშვნელობებს.
     */
    void methodSeven() {
        this.a = 5;
        this.b = 6;
    }
}
