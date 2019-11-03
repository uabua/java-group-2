package com.company.task2;

import java.io.FileWriter;
import java.io.IOException;

/*
განსაზღვრეთ კლასი FamilyBudget: მთელი ტიპის დახური money ცვლადით. ააგეთ მეთოდები რომლებიც საშუალებას იძლევა money ცვლადში მნიშვნელობის მინიჭების, შეცვლის, მიღების.
 */
public class FamilyBudget {
    private int money;

    void setMoney(int money) {
        if (money < 0) {
            System.out.println("შეუძლებელია ოპერაციის შესრულება.");
        } else {
            this.money = money;
            budgetState(this.money);
        }
    }

    void changeMoney(int money) {
        if (this.money + money < 0) {
            System.out.println("შეუძლებელია ოპერაციის შესრულება.");
        } else {
            this.money += money;
            budgetState(this.money);
        }
    }

    int getMoney() {
        return this.money;
    }

    /*
    დაწერეთ მეთოდი, რომელიც დაადგენს FamilyBudget მდგომარეობას money თვისების მიხედვით. (თუ money მეტია 40 000-ზე მდიდარი, თუ მოთავსებულია 10000-დან 40 000-მდე საშუალო, წინააღმდეგ შემთხვევაში ღარიბი).
     */
    void familySituation() {
        if (this.money > 40000) {
            System.out.println("მდიდარი");
        } else if (this.money > 10000 && this.money < 40000) {
            System.out.println("საშუალო");
        } else {
            System.out.println("ღარიბი");
        }
    }

    /*
    დაწერეთ მეთოდი, რომელიც budget.txt ფაილში შეინახავს მოთხოვნი FamilyBudget-ის money თვისების მდგომარეობას, ყოველი მისი ცვლილების დროს.
     */
    void budgetState(int money) {
        try {
            FileWriter fileWriter = new FileWriter("budget.txt", true);

            fileWriter.write(String.format("%d\n", money));

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
