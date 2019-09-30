package com.company;

import java.util.Scanner;

/*
განსაზღვრეთ კლასი A შვილობილის კლასი B: დაამატეთ მთელი ტიპის y ცვლადი, 2 მეთოდი.
 */
class B extends A {
    int y;

    /*
    შეაქვს y ცვლადში მონაცემი კლავიატურიდან.
     */
    void bMethodOne() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ მთელი რიცხვი: ");
        y = scanner.nextInt();
    }

    /*
    აბრუნებს x+y გამოსახულების მნიშვნელობას.
     */
    int bMethodTwo() {
        return x + y;
    }
}
