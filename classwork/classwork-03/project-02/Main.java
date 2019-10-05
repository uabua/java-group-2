package com.company;

public class Main {

    public static void main(String[] args) {
        A a = new A();

        a.methodOne();

        B b = new B(23);

        b.methodOne();

        C c = new C(1, 3);

        c.methodOne();
        c.methodTwo();

        D d = new D();

        System.out.println(d.methodOne());
        System.out.println(d.methodTwo());

        E e = new E(2.3f);

        System.out.println(e.methodOne());
        System.out.println(e.methodTwo());

        F f = new F(2.1f, 3.4f);

        System.out.println(f.methodOne(f.x, f.y));
    }
}
