package com.company;

public class Main {

    public static void main(String[] args) {
        C firstObj = new C();

        firstObj.methodOne();
        System.out.println(String.format("%d-ის ბოლო ციფრია %d.", firstObj.a, firstObj.methodTwo()));
        System.out.println(String.format("%d-ის პირველი ციფრია %d.", firstObj.b, firstObj.methodThree()));
        System.out.println(String.format("%d-ის ციფრთა ჯამია %d.", firstObj.c, firstObj.methodFour()));
        firstObj.methodFive();
        firstObj.methodSix();

        A secondObj = new A();

        secondObj.methodOne();
        secondObj.methodTwo();
        secondObj.methodThree();

        B thirdObj = new B();

        thirdObj.bMethodOne();
        System.out.println(String.format("%d + %d = %d", A.x, thirdObj.y, thirdObj.bMethodTwo()));

        Task3.main();
    }
}
