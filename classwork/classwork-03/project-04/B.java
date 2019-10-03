package com.company;

/*
განსაზღვრეთ კლასი: 2 მთელი ცვლადით n, y. 2 მეთოდით.
 */
class B {
    int n = 1;
    int y = 2;

    /*
    აბრუნებს 2n^2+1.
     */
    String methodOne() {
        return String.format("2 * %d^2 + 1 = %d", n, 2 * (int) Math.pow(n, 2) + 1);
    }

    /*
    აბრუნებს 3y^3-n^2
     */
    String methodTwo() {
        return String.format("3 * %d^3 - %d^2 = %d", y, n, 3 * (int) Math.pow(y, 3) - (int) Math.pow(n, 2));
    }
}
