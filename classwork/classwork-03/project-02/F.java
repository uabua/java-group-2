package com.company;

/*
განსაზღვრეთ კლასი: float ტიპის x, y ცვლადებით. 3 კონსტრუქტორით, 1 მეთოდით.
 */
class F {
    float x, y;

    /*
    ცარიელია;
     */
    F() {
    }

    /*
    ახდენს x ცვლადის ინიციალიზაციას;
     */
    F(float x) {
        this.x = x;
    }

    /*
    ახდენს x და y ცვლადის ინიციალიზაციას;
     */
    F(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /*
    აბრუნებს x-ის და y-ის უდიდეს საერთო გამყოფს;
     */
    float methodOne(float x, float y) {
        if (y == 0) {
            return x;
        }

        return methodOne(y, x % y);
    }
}
