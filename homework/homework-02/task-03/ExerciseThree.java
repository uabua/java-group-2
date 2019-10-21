package com.company.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
განსაზღვრეთ კლასი : ორი მთელი ტიპის a და b ცვლადით, კლასისთვის გამოიყენეთ ინტერფეისი.
 */
public class ExerciseThree implements Functions {
    private int a, b;

    /*
    ანიჭებს კლასის ცვლადებს მნიშვნელობებს.
     */
    void main(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /*
    ბეჭდავს ყველა მთელ რიცხვს a-სა და b-ს შორის;
     */
    @Override
    public void methodOne() {
        int min = Math.min(this.a, this.b);
        int max = Math.max(this.a, this.b);

        System.out.print(String.format("%d-სა და %d-ს შორის მოთავსებული მთელი რიცხვებია: ", min, max));
        for (int number = min; number <= max; number++) {
            System.out.print(String.format("%d ", number));
        }

        System.out.println("\n");
    }

    /*
    ბეჭდავს a-ს ყველა გამყოფს;
     */
    @Override
    public void methodTwo() {
        if (this.a > 0) {
            System.out.print(String.format("%d-ს გამყოფებია: ", this.a));

            for (int divisor = 1; divisor <= this.a; divisor++) {
                if (this.a % divisor == 0) {
                    System.out.print(String.format("%d ", divisor));
                }
            }

            System.out.println("\n");
        } else {
            System.out.println("მგონი სჯობს უარყოფითი რიცხვებისთვის სხვა პროგრამას მიაკითხო...");
        }

    }

    /*
    ბეჭდავს b-ს ყველა მარტივ გამყოფს;
     */
    @Override
    public void methodThree() {
        if (this.b > 0) {
            System.out.print(String.format("%d-ს მარტივი გამყოფებია: ", this.b));

            for (int divisor = 1; divisor <= this.b; divisor++) {
                if (this.b % divisor == 0 && isPrime(divisor)) {
                    System.out.print(String.format("%d ", divisor));
                }
            }

            System.out.println("\n");
        } else {
            System.out.println("მგონი სჯობს უარყოფითი რიცხვებისთვის სხვა პროგრამას მიაკითხო...");
        }
    }

    /*
    მარტივია თუ არა რიცხვი, მაგის გადასამოწმებელი ფუნქცია.
     */
    static boolean isPrime(int divisor) {
        // 1 და 1-ზე ნაკლები რიცხვები მარტივი არაა
        if (divisor <= 1) {
            return false;
        }

        // 2 და 3 მარტივი რიცხვია
        if (divisor <= 3) {
            return true;
        }

        // თუ ლუწია(გარდა 2-ისა) ან 3-ზე იყოფა, არ არის მარტივი
        if (divisor % 2 == 0 || divisor % 3 == 0) {
            return false;
        }

        for (int i = 5; Math.pow(i, 2) <= divisor; i += 6) {
            if (divisor % i == 0 || divisor % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    /*
    აბრუნებს b-ს ჩანაწერში ყველაზე ხშირად გამეორებად ციფრს.
     */
    @Override
    public String methodFour() {
        // მინუსის გამო დაბნევის თავიდან ასაცილებლად
        this.b = Math.abs(this.b);

        // ციფრისა და მისი გამეორების შესანახად
        HashMap<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        int maximumFrequency = 0;
        // ხშირად გამეორებული ციფრების შესანახად, თუ 1-ზე მეტი ციფრი იქნება ასეთი
        List<Integer> maximumFrequencyDigits = new ArrayList<Integer>();

        // ჰეშმეფში რიცხვისა და მისი გამეორების მნიშვნელობის შესაყვანად
        for (int digit = 0; digit <= 9; digit++) {
            int count = countDigitOccurrence(this.b, digit);

            occurrences.put(digit, count);
        }

        // ყველაზე ხშირად გამეორებადი ციფრის გამეორების მაქსიმუმი მნიშვნელობა
        for (Integer frequency : occurrences.values()) {
            if (frequency > maximumFrequency) {
                maximumFrequency = frequency;
            }
        }

        // ერეილისტში ხშირად გამეორებული ციფრების ჩამატება
        for (Integer digit : occurrences.keySet()) {
            if (occurrences.get(digit) == maximumFrequency) {
                maximumFrequencyDigits.add(digit);
            }
        }

        return String.format("%d-ს ჩანაწერში ყველაზე ხშირად გამეორებად ციფრ(ებ)ია: %s", this.b,
                maximumFrequencyDigits.toString().replace("[", "").replace("]", ""));
    }

    /*
    ითვლის ციფრის გამეორებას რიცხვის ჩანაწერში.
     */
    static int countDigitOccurrence(int number, int digit) {
        int count = 0;

        while (number > 0) {
            if (number % 10 == digit) {
                count++;
            }

            number /= 10;
        }

        return count;
    }
}
