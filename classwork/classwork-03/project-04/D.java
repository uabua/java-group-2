package com.company;

/*
განსაზღვრეთ კლასი: ცვლადების რაოდენობა განსაზღვრეთ გონივრულად(double ტიპის). 3 მეთოდით.
 */
class D {
    double a = 1.0;
    double b = 2.0;
    double z = 2.0;

    /*
    აბრუნებს (a + b^3 -7)/(z+8).
     */
    String methodOne() {
        return String.format("(%f + %f^3 - 7 )/(%f + 8) = %f", a, b, z, (a + Math.pow(b, 3) - 7) / (z + 8));
    }

    /*
    აბრუნებს (a + z + b^3)/(z*a*b).
     */
    String methodTwo() {
        return String.format("(%f + %f + %f^3)/(%f * %f * %f) =  %f", a, z, b, z, a, b, (a + z + Math.pow(b, 3)) / (z * a * b));
    }

    /*
    აბრუნებს (a*z - b)/(z*b).
     */
    String methodThree() {
        return String.format("(%f * %f - %f)/(%f * %f) = %f", a, z, b, z, b, (a * z - b) / (z * b));
    }
}
