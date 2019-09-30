package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
შეიტანეთ a და b მთელი რიცხვები, გამოიტანეთ [a; b] შუალედიდან 40 შემთხვევითი რიცხვი (თუ a მეტია b-ზე, ამ ორი ცვლადის
მნიშვნელობას გაუცვალეთ ადგილები). დაადგინეთ რამდენი ლუწი და რამდენი კენტი რიცხვია გამოტანილ რიცხვებს შორის,
გამოიტანეთ ლუწი და კენტი რიცხვების ჯამი, მიღებულ ჯამებს შორის გამოიტანეთ 5 შემთხვევითი რიცხვი.
 */
class Task3 {
    static void main() {
        int a, b, sumOfEvenNums, sumOfOddNums;
        int[] randomArray;

        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანეთ მთელი რიცხვი: ");
        a = scanner.nextInt();

        System.out.print("შეიყვანეთ მთელი რიცხვი: ");
        b = scanner.nextInt();

        // 40 წევრიანი რენდომული მასივი
        if (a < b) {
            randomArray = randomNumbers(a, b);
        } else {
            randomArray = randomNumbers(b, a);
        }

        // მასივის დაბეჭდვა
        System.out.println(Arrays.toString(randomArray));

        // ლუწი რიცხვების რაოდენობა
        System.out.println(String.format("მასივში %d ლუწი რიცხვია.", evenNumbers(randomArray)));

        // კენტი რიცხვების რაოდენობა
        System.out.println(String.format("მასივში %d კენტი რიცხვია.", oddNumbers(randomArray)));

        // ლუწი რიცხვების ჯამი
        sumOfEvenNums = sumOfEvenNumbers(randomArray);
        System.out.println(String.format("მასივში ლუწი რიცხვების ჯამია %d.", sumOfEvenNums));

        // კენტი რიცხვების ჯამი
        sumOfOddNums = sumOfOddNumbers(randomArray);
        System.out.println(String.format("მასივში კენტი რიცხვების ჯამია %d.", sumOfOddNums));

        // 5 რანდომული რიცხვის მასივი
        if (sumOfEvenNums < sumOfOddNums) {
            System.out.println(Arrays.toString(fiveRandomNumbers(sumOfEvenNums, sumOfOddNums)));
        } else {
            System.out.println(Arrays.toString(fiveRandomNumbers(sumOfOddNums, sumOfEvenNums)));
        }

    }

    private static int[] randomNumbers(int min, int max) {
        int[] randomNumbersArray = new int[40];

        Random random = new Random();

        // ქმნის რენდომულ 40 წევრიან მასივს min.max შუალედში.
        for (int i = 0; i < 40; i++) {
            int randomNum = random.nextInt(max - min + 1) + min;
            randomNumbersArray[i] = randomNum;
        }

        return randomNumbersArray;
    }

    // ლუწი რიცხვების რაოდებობას ვიგებთ
    private static int evenNumbers(int[] array) {
        int even = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                even++;
            }
        }

        return even;
    }

    // კენტი რიცხვების რაოდენობას ვიგებთ
    private static int oddNumbers(int[] array) {
        int odd = 0;

        for (int num : array) {
            if (num % 2 != 0) {
                odd++;
            }
        }

        return odd;
    }

    // ლუწი რიცხვების ჯამი
    private static int sumOfEvenNumbers(int[] array) {
        int sum = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                sum = sum + num;
            }
        }

        return sum;
    }

    // კენტი რიცხვების ჯამი
    private static int sumOfOddNumbers(int[] array) {
        int sum = 0;

        for (int num : array) {
            if (num % 2 != 0) {
                sum = sum + num;
            }
        }

        return sum;
    }

    private static int[] fiveRandomNumbers(int min, int max) {
        int[] randomNumbersArray = new int[5];

        Random random = new Random();

        // ქმნის რენდომულ 5 წევრიან მასივს min.max შუალედში.
        for (int i = 0; i < 5; i++) {
            int randomNum = random.nextInt(max - min + 1) + min;
            randomNumbersArray[i] = randomNum;
        }

        return randomNumbersArray;
    }
}
