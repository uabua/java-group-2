package com.company;

/*
განსაზღვრეთ კლასი: 2 ნამდვილი ცვლადით a, b. 2 მეთოდით.
 */
class C {
    int a = 1;
    int b = 2;

    /*
    აბრუნებს (4a^2)/(b) - 1.
     */
    String methodOne() {
        return String.format("(4 * %d^2)/(%d) - 1 = %d", a, b, (4 * (int) Math.pow(a, 2)) / (b) - 1);
    }

    /*
    აბრუნებს (3a^3)/2 - b^2.
   */
    String methodTwo() {
        return String.format("(3 * %d^3)/2 - %d^2 = %d", a, b, (3 * (int) Math.pow(a, 3)) / 2 - (int) Math.pow(b, 2));
    }
}
