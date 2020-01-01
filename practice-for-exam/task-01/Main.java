package com.company.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანე მთელი რიცხვი: ");
        int a = scanner.nextInt();

        System.out.print("შეიყვანე მთელი რიცხვი: ");
        int b = scanner.nextInt();

        A objA = new A();
        objA.methodOne(a, b);
        System.out.println(objA.methodTwo());
        System.out.println(objA.methodThree());
        objA.methodFour();
    }
}
