package com.company;

/*
განსაზღვრეთ კლასი: float ტიპის x, y ცვლადებით. 2 კონსტრუქტორით, 2 მეთოდით.
 */
class E {
    float x;
    float y = 2.1f;

    /*
    ცარიელია;
     */
    E() {
    }

    /*
    ახდენს x ცვლადის ინიციალიზაციას;
     */
    E(float x) {
        this.x = x;
    }

    /*
    გვიბრუნებს (x/y)+ xy თუ y ≠ 0, x^4 + y თუ x≤0;
     */
    String methodOne() {
        if (this.y != 0.0f) {
            return String.format("(%f/ %f) + %f * %f = %f", this.x, this.y, this.x, this.y,
                    (this.x / this.y) + this.x * this.y);
        } else if (this.x <= 0.0f) {
            return String.format("%f^4 + %f = %f", this.x, this.y, (float) Math.pow(this.x, 4) + this.y);
        } else {
            return "არცერთ პირობას არ აკმაყოფილებს"; // იმ შემთხვევაში თუ არცერთ პირობას არ დააკმაყოფილებს
        }
    }

    /*
    გვიბრუნებს x-სა და y-ს შორის მინიმალურს;
     */
    String methodTwo() {
        if (this.x < this.y) {
            return String.format("მინიმალური: %f", this.x);
        } else {
            return String.format("მინიმალური: %f", this.y);
        }
    }
}
