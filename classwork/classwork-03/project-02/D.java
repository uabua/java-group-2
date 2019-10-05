package com.company;

/*
განსაზღვრეთ კლასი: მთელი ტიპის x, y ცვლადებით. კონსტრუქტორით, 2 მეთოდით.
 */
class D {
    int x = 1;
    int y = -3;

    /*
    ბეჭდავს „hello My Class“;
     */
    D() {
        System.out.println("Hello My Class.");
    }

    /*
    გვიბრუნებს 4*x-y თუ x>0, 2*x+y თუ x≤0;
     */
    String methodOne() {
        if (this.x > 0) {
            return String.format("4 * %d - %d = %d", this.x, this.y, 4 * this.x - this.y);
        } else {
            return String.format("2 * %d + %d = %d", this.x, this.y, 2 * this.x + this.y);
        }
    }

    /*
    გვიბრუნებს 4*x+y თუ y>0, 2*x-y თუ y≤0;
     */
    String methodTwo() {
        if (this.y > 0) {
            return String.format("4 * %d + %d = %d", this.x, this.y, 4 * this.x + this.y);
        } else {
            return String.format("2 * %d - %d = %d", this.x, this.y, 2 * this.x - this.y);
        }
    }
}
