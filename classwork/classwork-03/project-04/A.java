package com.company;

/*
განსაზღვრეთ კლასი: 3 მთელი ცვლადით x, y, z. 3 მეთოდით.
 */
class A {
    int x = 1;
    int y = 2;
    int z = 3;

    /*
    აბრუნებს 2x-7.
     */
    String methodOne() {
        return String.format("2 * %d - 7 = %d", x, 2 * x - 7);
    }

    /*
    აბრუნებს 3y+z.
     */
    String methodTwo() {
        return String.format("3 * %d + %d = %d", y, z, 3 * y + z);
    }

    /*
    აბრუნებს 12y-x+z.
     */
    String methodThree() {
        return String.format("12 * %d - %d + %d =  %d", y, x, z, 12 * y - x + z);
    }
}
