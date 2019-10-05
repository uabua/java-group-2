package com.company;

/*
განსაზღვრეთ კლასი: მთელი ტიპის x ცვლადით. 2 კონსტრუქტორით, 1 მეთოდით.
 */
class B {
    int x;

    /*
    ცარიელია;
     */
    B() {
    }

    /*
    ახდენს x ცვლადის ინიციალიზაციას;
     */
    B(int x) {
        this.x = x;
    }

    /*
    ადგენს x-ის მნიშვნელობა მოთავსებულია თუ არა [5; 24] შუალედში;
     */
    void methodOne() {
        if (this.x >= 5 && this.x <= 24) {
            System.out.println(String.format("%d [5;24] შუალედშია.", this.x));
        } else {
            System.out.println(String.format("%d [5;24] შუალედში არ არის.", this.x));
        }
    }
}
