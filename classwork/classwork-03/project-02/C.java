package com.company;

/*
განსაზღვრეთ კლასი: მთელი ტიპის a, b, x ცვლადით. 2 კონსტრუქტორით, 2 მეთოდით.
 */
class C {
    int a, b;
    int x = 1;

    /*
    ცარიელია;
     */
    C() {
    }

    /*
    ახდენს a და b ცვლადის ინიციალიზაციას;
     */
    C(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /*
    ადგენს [a; b] წარმოადგენს თუ არა შუალედს;
     */
    void methodOne() {
        if (this.a < this.b) {
            System.out.println(String.format("[%d; %d] წარმოადგენს შუალედს.", this.a, this.b));
        } else {
            System.out.println(String.format("[%d; %d] არ წარმოადგენს შუალედს.", this.a, this.b));
        }
    }

    /*
    ადგენს x ცვლადი მდებარეობს თუ არა [a; b] შუალედში;
     */
    void methodTwo() {
        if (this.x >= this.a && this.x <= this.b) {
            System.out.println(String.format("%d [%d; %d] შუალედშია.", this.x, this.a, this.b));
        }
    }
}
