package com.company.percentages;

public class PercentageCalculator implements Percentage {
    @Override
    /*
    დაწერეთ მარტივი პროცენტის გამოსათვლელი პროგრამა. მოცემულია ოთხი მონაცემი
    p - საწყისი თანხა,
    n - წლების რაოდენობა,
    q - საბოლოო თანხა.
    k - პროცენტების რაოდენობა.
    დანარჩენი სამი სიდიდის მიხედვით გამოთვალეთ მეოთხე.
     */
    public void exerciseTwelve(double p, double n, double q) {
        System.out.println(String.format("საწყისი თანხა: %.2f\nწლების რაოდენობა: %.2f\nსაბოლოო თანხა: %.2f\nპროცენტი:" +
                        " %.2f",
                p, n, q, ((q - p) / (n * p)) * 100));
    }

    @Override
    /*
    დავწეროთ რთული პროცენტის გამოსათვლელი პროგრამა. მოცემულია ოთხი მონაცემი
    p - საწყისი თანხა,
    n - წლების რაოდენობა,
    q - საბოლოო თანხა.
    k - პროცენტების რაოდენობა.
    დანარჩენი სამი სიდიდის მიხედვით გამოთვალეთ მეოთხე.
     */
    public void exerciseThirteen(double p, double n, double q) {
        System.out.println(String.format("საწყისი თანხა: %.2f\nწლების რაოდენობა: %.2f\nსაბოლოო თანხა: %.2f\nპროცენტი:" +
                        " %.2f",
                p, n, q, ((Math.pow(q / p, 1 / n) - 1) * 100)));
    }
}
