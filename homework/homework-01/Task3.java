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
            randomArray = randomNumbers(a, b, 40);
        } else {
            randomArray = randomNumbers(b, a, 40);
        }

        // მასივის დაბეჭდვა
        System.out.println(Arrays.toString(randomArray));

        // ლუწი რიცხვების რაოდენობა
        System.out.println(String.format("მასივში %d ლუწი რიცხვია.", countNumbers(randomArray, 0)));

        // კენტი რიცხვების რაოდენობა
        System.out.println(String.format("მასივში %d კენტი რიცხვია.", countNumbers(randomArray, 1)));

        // ლუწი რიცხვების ჯამი
        sumOfEvenNums = sumOfNumbers(randomArray, 0);
        System.out.println(String.format("მასივში ლუწი რიცხვების ჯამია %d.", sumOfEvenNums));

        // კენტი რიცხვების ჯამი
        sumOfOddNums = sumOfNumbers(randomArray, 1);
        System.out.println(String.format("მასივში კენტი რიცხვების ჯამია %d.", sumOfOddNums));

        // 5 რანდომული რიცხვის მასივი
        if (sumOfEvenNums < sumOfOddNums) {
            System.out.println(Arrays.toString(randomNumbers(sumOfEvenNums, sumOfOddNums, 5)));
        } else {
            System.out.println(Arrays.toString(randomNumbers(sumOfOddNums, sumOfEvenNums, 5)));
        }

    }

    /*
    ქმნის რენდომულ მასივს min.max შუალედში.
     */
    private static int[] randomNumbers(int min, int max, int length) {
        int[] randomNumbersArray = new int[length];

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomNum = random.nextInt(max - min + 1) + min;
            randomNumbersArray[i] = randomNum;
        }

        return randomNumbersArray;
    }

    /*
    ლუწი/კენტი რიცხვების რაოდებობას ვიგებთ, თუ remainder არის 0 მაშინ ლუწ რიცხვებს, თუ 1 მაშინ კენტს.
     */
    private static int countNumbers(int[] array, int remainder) {
        int total = 0;

        for (int num : array) {
            if (num % 2 == remainder) {
                total++;
            }
        }

        return total;
    }

    /*
    კენტი/ლუწი რიცხვების ჯამი. თუ remainder არის 0 მაშინ ლუწ რიცხვებს, თუ 1 მაშინ კენტს.
     */
    private static int sumOfNumbers(int[] array, int remainder) {
        int sum = 0;

        for (int num : array) {
            if (num % 2 == remainder) {
                sum = sum + num;
            }
        }

        return sum;
    }
}
