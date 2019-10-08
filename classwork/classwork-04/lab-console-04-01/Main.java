package com.company;

public class Main {

    public static void main(String[] args) {
        A aObj = new A();

        aObj.methodOne();
        aObj.methodTwo();
        aObj.methodThree();
        aObj.methodFour();
        System.out.println(aObj.methodFive());
        System.out.println(aObj.methodSix());
        aObj.methodSeven();

        B bObj = new B();

        bObj.methodOne();
        bObj.methodTwo();
        bObj.methodThree();
        bObj.methodFour();
        System.out.println(bObj.methodFive());
        bObj.methodSix();
        bObj.methodSeven();
        bObj.methodEight();

        C cObj = new C();

        cObj.methodOne();
        cObj.methodTwo();
        cObj.methodThree();
        cObj.methodFour();
        cObj.methodFive();
        cObj.methodSix();
    }
}
