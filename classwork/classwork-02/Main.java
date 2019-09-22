package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //exerciseOne();
        //exerciseTwo();
        //exerciseThree();
        //exerciseFour();
        //exerciseFive();
        //exerciseSix();
        //exerciseSeven(10, 5);
        //exerciseEight(1, 5);
        //exerciseNine();
        //exerciseTen();
        //exerciseEleven();
        //exerciseTwelve();
    }


    /*
    გამოიტანეთ დაპროგრამების ენების სახელები ცალ–ცალკე ხაზზე( C++, C#, java, pascal, php, JavaScript, ActionScript).

    აქ შეგვეძლო ცალ-ცალკეც დაგვეპრინტა, თუმცა სტრინგების მასიცი და for-each ციკლი ვარჩიე.
    */
    public static void exerciseOne() {
        String[] programmingLanguages = {"C++", "C#", "java", "pascal", "php", "JavaScript", "ActionScript"};

        for (String language : programmingLanguages) {
            System.out.println(language);
        }
    }


    /*
    დავწეროთ კოდი რომელიც გამოიტანს შეტანილი ორი მთელი რიცხვის შემთხვევაში, პირველის მეორეზე გაყოფის შედეგად მიღებულ
    მთელ შედეგს და მეორის პირველზე გაყოფის შედეგად მიღებულ ნაშთს. (ფორმატის გათვალისწინებით).
     */
    public static void exerciseTwo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანე პირველი (მთელი) რიცხვი: ");
        int first = scanner.nextInt();

        System.out.print("შეიყვანე მეორე (მთელი) რიცხვი: ");
        int second = scanner.nextInt();

        System.out.println(String.format("%d / %d = %d", first, second, first / second));
        System.out.println(String.format("%d %% %d = %d", second, first, second % first));
    }


    /*
    შეიტანეთ სამი მთელი რიცხვი, გამოიტანეთ მათი ჯამი და ნამრავლი.
     */
    public static void exerciseThree() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანე პირველი (მთელი) რიცხვი: ");
        int first = scanner.nextInt();

        System.out.print("შეიყვანე მეორე (მთელი) რიცხვი: ");
        int second = scanner.nextInt();

        System.out.print("შეიყვანე მესამე (მთელი) რიცხვი: ");
        int third = scanner.nextInt();

        System.out.println(String.format("%d + %d + %d = %d", first, second, third, first + second + third));
        System.out.println(String.format("%d * %d * %d = %d", first, second, third, first * second * third));
    }


    /*
    შეიტანეთ სამნიშნა მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრები ცალ-ცალკე ხაზზე.
     */
    public static void exerciseFour() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანე სამნიშნა რიცხვი: ");
        int num = scanner.nextInt();

        System.out.println(num / 100);
        System.out.println((num / 10) % 10);
        System.out.println(num % 10);
    }


    /*
    შეიტანეთ ოთხნიშნა მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრთა ჯამი.
     */
    public static void exerciseFive() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანე ოთხნიშნა რიცხვი: ");
        int num = Math.abs(scanner.nextInt());

        int sum = 0;

        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        System.out.println(String.format("ციფრთა ჯამია: %d", sum));
    }


    /*
    შეიტანეთ ნებისმიერი მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრთა ჯამი.

    ეს იგივენაირად შეგვიძლია დავწეროთ როგორც მეხუთე დავალება. თუმცა ინტი ვერ დაიტევს ნებისმიერ მთელ რიცხვს, ნუ ვერც
    ვერაფერი, მაგრამ ლონგს გამოვიყენებ აქ მაინც.
     */
    public static void exerciseSix() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანე რიცხვი: ");
        long num = Math.abs(scanner.nextLong());

        long sum = 0;

        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        System.out.println(String.format("ციფრთა ჯამია: %d", sum));
    }


    /*
    იპოვეთ ორი მთელი რიცხვის უდიდესი საერთო გამყოფი და უმცირესი საერთო ჯერადი.(ევკლიდეს ალგორითმი).

    უსგ-სა და უსჯ-ს გამოსათვლელი მეთოდები ცალკე შევქმენი და ამ მეთოდში ვიძახებ.
     */
    public static void exerciseSeven(int first, int second) {
        System.out.print(String.format("უსგ(%d, %d): ", first, second));
        System.out.println(gcd(first, second));

        System.out.print(String.format("უსჯ(%d, %d): ", first, second));
        System.out.println(lcm(first, second));
    }

    // უდიდესი საერთო გამყოფის გამოსათვლელი მეთოდი
    public static int gcd(int first, int second) {
        if (second == 0) {
            return first;
        }

        return gcd(second, first % second);
    }

    // უმცირესი საერთო ჯერადის გამოსათვლელი მეთოდი
    public static int lcm(int first, int second) {
        return (first * second) / gcd(first, second);
    }


    /*
    დაბეჭდეთ მთელი რიცხვები M-დან N-მდე.
     */
    public static void exerciseEight(int first, int last) {
        while (first < last) {
            System.out.println(first);
            first++;
        }
    }


    /*
    განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, დაბეჭდეთ მასივის ელემენტები, მასივის უდიდესი და უმცირესი ელემენტი.
     */
    public static void exerciseNine() {
        double[] numbers = {1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8};

        // მასივის წევრების დაბეჭდვა
        for (double number : numbers) {
            System.out.println(number);
        }

        // უდიდესი და უმცირესი წევრის დაბეჭდვა
        double max = numbers[0];
        double min = numbers[0];

        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println(String.format("უდიდესი: %f", max));
        System.out.println(String.format("უმცირესი: %f", min));
    }


    /*
    განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, დაალაგეთ მასივი ზრდადობით, დაბეჭდეთ მასივი.

    ვიყენებ ჩასმით სორტირების ალგორითმს.
     */
    public static void exerciseTen() {
        double[] numbers = {1.0, 2.1, 1.5, 3.7, 1.4, 1.0, 1.6, 1.9, 1.8};

        for (int n = 1; n < numbers.length; n++) {
            double key = numbers[n];
            int i = n - 1;

            while (i >= 0 && numbers[i] > key) {
                numbers[i + 1] = numbers[i];
                i--;
            }

            numbers[i + 1] = key;
        }

        System.out.print(Arrays.toString(numbers));
    }


    /*
    განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, ჩაწერეთ მასში შემთხვევითი რიცხვები, დაბეჭდეთ მასივი.
     */
    public static void exerciseEleven() {
        double[] randomNumbers = new double[8];

        for (int n = 0; n < 8; n++) {
            randomNumbers[n] = Math.random();
        }

        System.out.print(Arrays.toString(randomNumbers));
    }


    /*
    განსაზღვრეთ 8 ელემენტიანი მთელ რიცხვთა მასივი, ჩაწერეთ მასში შემთხვევითი რიცხვები, დაალაგეთ მასივი კლებადობით,
    დაბეჭდეთ მასივი.
     */
    public static void exerciseTwelve() {
        int[] randomNumbers = new int[8];

        // მასივში რიცვების შეტანა 0-1000 შუალედში იქნება ეს რიცვები
        for (int n = 0; n < 8; n++) {
            randomNumbers[n] = (int) (Math.random() * 1000);
        }

        // ჩასმით სორტირებას ვიყენებ
        for (int n = 1; n < randomNumbers.length; n++) {
            int key = randomNumbers[n];
            int i = n - 1;

            while (i >= 0 && randomNumbers[i] < key) {
                randomNumbers[i + 1] = randomNumbers[i];
                i--;
            }

            randomNumbers[i + 1] = key;
        }

        System.out.print(Arrays.toString(randomNumbers));
    }
}