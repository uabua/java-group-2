package com.company;

public class Main {

    public static void main(String[] args) {
        A firstObj = new A();
        firstObj.methodOne();
        firstObj.methodTwo();
        System.out.println(firstObj.methodThree());
        System.out.println(firstObj.methodFour());

        B secondObj = new B();
        secondObj.methodOne();
        secondObj.methodTwo();
        secondObj.methodThree();
        System.out.println(String.format("გაბნევის დიაპაზონია: %d", secondObj.methodFour()));

    }
}
