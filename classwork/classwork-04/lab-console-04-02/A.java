package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
განსაზღვრეთ კლასი A: ორი მთელი ტიპის ცვლადით a, b, მთელი ტიპის 12 ელემენტიანი m მასივით;
 */
class A {
    int a, b;
    int[] m = new int[12];

    /*
    ანიჭებს a და b ცვლადებს შემთხვევით მნიშვნელობებს [10; 25] შუალედიდან;
     */
    void methodOne() {
        Random random = new Random();

        this.a = random.nextInt(16) + 10;
        this.b = random.nextInt(16) + 10;
    }

    /*
    აბრუნებს a და b ცვლადების მნიშვნელობებს;
     */
    String methodTwo() {
        return String.format("a = %d\nb = %d", this.a, this.b);
    }

    /*
    აბრუნებს a და b ცვლადების მნიშვნელობებს შესაბამის სიმბოლოებს;
     */
    String methodThree() {
        return String.format("char a = %c\nchar b = %c", (char) this.a + 'a', (char) this.b + 'a');
    }

    /*
    ანიჭებს m მასივს შემთხვევით მნიშვნელობებს [-10; 60] შუალედიდან;
     */
    void methodFour() {
        Random random = new Random();

        for (int i = 0; i < 12; i++) {
            int randomNum = random.nextInt(71) - 10;
            this.m[i] = randomNum;
        }
    }

    /*
    ბეჭდავს m მასივის ლუწ ელემენტებს;
     */
    void methodFive() {
        for (int num : this.m) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    /*
    ბეჭდავს m მასივის დადებითი ელემენტების ჯამს;
     */
    void methodSix() {
        int sum = 0;

        for (int num : this.m) {
            if (num > 0) {
                sum = sum + num;
            }
        }

        if (sum > 0) {
            System.out.println(String.format("დადებითი ელემენტების ჯამი: %d", sum));
        } else {
            System.out.println("მასივში არ არის დადებითი რიცხვები,");
        }
    }

    /*
    ბეჭდავს m მასივს დადებით ელემენტებს შორის მინიმალურს.
     */
    void methodSeven() {
        List<Integer> positiveNumbers = new ArrayList<>();

        for (int num : this.m) {
            if (num > 0) {
                positiveNumbers.add(num);
            }
        }

        if (positiveNumbers.size() > 0) {
            int min = positiveNumbers.get(0);
            for (int num : positiveNumbers) {
                if (num < min) {
                    min = num;
                }
            }

            System.out.println(String.format("მინიმალური: %d", min));
        } else {
            System.out.println("მასივში არ არის დადებითი რიცხვები,");
        }
    }
}
