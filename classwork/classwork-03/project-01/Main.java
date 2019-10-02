package com.company;

public class Main {

    public static void main(String[] args) {
        A firstObj = new A();

        firstObj.methodOne();
        firstObj.methodTwo();
        System.out.println(firstObj.methodThree());

        B secondObj = new B();

        secondObj.methodOne();
        secondObj.methodTwo();
        System.out.println(secondObj.methodThree());

        C thirdObj = new C();

        thirdObj.methodOne();
        System.out.println(String.format("%d-ის ბოლო ციფრია %d.", thirdObj.a, thirdObj.methodTwo()));
        System.out.println(String.format("%d-ის პირველი ციფრია %d.", thirdObj.b, thirdObj.methodThree()));
        System.out.println(String.format("%d-ის ციფრთა ჯამია %d.", thirdObj.c, thirdObj.methodFour()));
        thirdObj.methodFive();
        thirdObj.methodSix();
    }
}
