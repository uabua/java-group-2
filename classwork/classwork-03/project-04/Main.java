package com.company;

public class Main {

    public static void main(String[] args) {
        A firstObj = new A();

        System.out.println(firstObj.methodOne());
        System.out.println(firstObj.methodTwo());
        System.out.println(firstObj.methodThree());

        B secondObj = new B();

        System.out.println(secondObj.methodOne());
        System.out.println(secondObj.methodTwo());

        C thirdObj = new C();

        System.out.println(thirdObj.methodOne());
        System.out.println(thirdObj.methodTwo());

        D fourthObj = new D();

        System.out.println(fourthObj.methodOne());
        System.out.println(fourthObj.methodTwo());
        System.out.println(fourthObj.methodThree());

    }
}
