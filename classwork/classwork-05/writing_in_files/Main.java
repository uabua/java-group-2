package com.company.writing_in_files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();
        exerciseSix();
        exerciseSeven();
        exerciseEight();
        exerciseNine();
    }

    /*
    მთელი 24, 39, -90 რიცხვები ჩაწერეთ data.txt ფაილში, ფაილი შექმენით myFiles საქაღალდეში.
     */
    private static void exerciseOne() {
        int[] numbers = {24, 39, -90};

        try {
            FileWriter fileWriter = new FileWriter("myFiles/data.txt", true);

            for (int number : numbers) {
                fileWriter.write(String.format("%d\n", number));
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
    0-დან 100-მდე მთელი რიცხვები ჩაწერეთ data1.txt ფაილში. myFiles საქაღალდეში.
     */
    private static void exerciseTwo() {
        try {
            FileWriter fileWriter = new FileWriter("myFiles/data1.txt", true);

            for (int number = 0; number < 100; number++) {
                fileWriter.write(String.format("%d\n", number));
            }

            fileWriter.close();
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    /*
    myFiles1 საქაღალდეში საქაღალდეში შექმენით 30 ფაილი, ფაილებში ჩაწერეთ სიტყვა „Programmer“.
     */
    private static void exerciseThree() {
        for (int i = 1; i <= 30; i++) {
            try {
                FileWriter fileWriter = new FileWriter(String.format("myFiles1/%d.txt", i));

                fileWriter.write("Programmer");

                fileWriter.close();
            } catch (IOException error) {
                error.printStackTrace();
            }
        }
    }

    /*
    myFiles2 საქაღალდეში საქაღალდეში შექმენით 30 ფაილი, ფაილებში ჩაწერეთ სიტყვები „Programmer1“, „Programmer2“ ....
    „Programmer30“.
     */
    private static void exerciseFour() {
        for (int i = 1; i <= 30; i++) {
            try {
                FileWriter fileWriter = new FileWriter(String.format("myFiles2/%d.txt", i));

                fileWriter.write(String.format("Programmer%d", i));

                fileWriter.close();
            } catch (IOException error) {
                error.printStackTrace();
            }
        }
    }

    /*
    კლავიატურიდან გადაცემული [a, b] შუალედიდან ჩაწერეთ data2.txt ფაილში 100 შემთხვევითი მთელი რიცხვი. ფაილი შექმენით
    myFiles საქაღალდეში.
     */
    private static void exerciseFive() {
        try {
            FileWriter fileWriter = new FileWriter("myFiles/data2.txt", true);

            Scanner scanner = new Scanner(System.in);

            System.out.print("შეიყვანეთ მთელი რიცხვი: ");
            int a = scanner.nextInt();

            System.out.print("შეიყვანეთ მთელი რიცხვი: ");
            int b = scanner.nextInt();

            if (a < b) {
                Random random = new Random();

                for (int number = 0; number < 100; number++) {
                    int randomNumber = random.nextInt(b - a + 1) + a;
                    fileWriter.write(String.format("%d\n", randomNumber));
                }
            } else {
                System.out.println("უპს.. პატარა შეცდომაა. ხელახლა სცადეთ.");
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    კლავიატურიდან გადაცემული [a, b] შუალედიდან დაამატეთ data3.txt ფაილში 50 შემთხვევითი ნამდვილი რიცხვი
    myFiles საქაღალდეში.
     */
    private static void exerciseSix() {
        try {
            FileWriter fileWriter = new FileWriter("myFiles/data3.txt", true);

            Scanner scanner = new Scanner(System.in);

            System.out.print("შეიყვანეთ რიცხვი: ");
            double a = scanner.nextDouble();

            System.out.print("შეიყვანეთ რიცხვი: ");
            double b = scanner.nextDouble();

            if (a < b) {
                Random random = new Random();

                for (int number = 0; number < 50; number++) {
                    double randomNumber = a + (b - a) * random.nextDouble();
                    fileWriter.write(String.format("%f\n", randomNumber));
                }
            } else {
                System.out.println("უპს.. პატარა შეცდომაა. ხელახლა სცადეთ.");
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    დაწერეთ პროგრამა, რომელიც y = x^3 + e^x ფუნქციის მნიშვნელობებს დაითვლის [0; 2] შუალედში მეასედების სიზუსტით და
    შესაბამის მნიშვნელობებს ჩაწერს function.txt ფაილში myFiles საქაღალდეში.
     */
    private static void exerciseSeven() {
        try {
            FileWriter fileWriter = new FileWriter("myFiles/function.txt", true);

            for (int i = 0; i < 3; i++) {
                fileWriter.write(String.format("y = %d^3 + e^%d = %.2f\n", i, i, Math.pow(i, 3) + Math.pow(Math.E,
                        i)));
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    დაწერეთ პროგრამა, რომელიც y = sin(x) + e^x + 1 ფუნქციის მნიშვნელობებს დაითვლის[0; 2] შუალედში მეასედების სიზუსტით
     და შესაბამის მნიშვნელობებს ჩაწერს function.txt ფაილში.
     */
    private static void exerciseEight() {
        try {
            FileWriter fileWriter = new FileWriter("myFiles/function.txt", true);

            for (int i = 0; i < 3; i++) {
                fileWriter.write(String.format("y = sin(%d) + e^%d + 1 = %.2f\n", i, i,
                        Math.sin(i) + Math.pow(Math.E,
                                i) + 1));
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    /*
    დაწერეთ ფუნქცია, რომელიც ჩაწერს 10 000-ს ‘.txt’ გაფართოების ფაილს myFiles საქაღალდეში, ფაილებში ჩაწერს 1-დან 10
    000-მდე რიცხვებს და შესაბამისად ფაილის სახელი იქნება ის რიცხვი რაც ჩაწერილია შესაბამის ფაილში. მაგ(თუ ფაილში
    ჩაწერილია რიცხვი 12 მაშინ ამ ფაილის სახელი იქნება 12.txt).
     */
    private static void exerciseNine() {
        for (int i = 1; i <= 10000; i++) {
            try {
                FileWriter fileWriter = new FileWriter(String.format("myFiles/%d.txt", i));

                fileWriter.write(String.format("%d", i));

                fileWriter.close();
            } catch (IOException error) {
                error.printStackTrace();
            }
        }
    }
}
