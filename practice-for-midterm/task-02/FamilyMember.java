package com.company.task2;

import java.io.FileWriter;
import java.io.IOException;

/*
განსაზღვრეთ კლასი FamilyMember ოთხი დახურული თვისებით: name, lastName, age, status.
 */
public class FamilyMember {
    private String name, lastName, status;
    private int age;

    /*
    დაწერეთ FamilyMember კონსტრუქტორი, რომელიც უზრუნველყოფს თვისებების ინიციალიზაციას.
     */
    FamilyMember(String name, String lastName, int age, String status) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.status = status;
    }

    /*
    დაწერეთ მეთოდი, რომელიც family.txt ფაილში დაამატებს FamilyMember-ის ტიპის ობიექტის ველების მნიშვნელობას ცალკე ხაზზე.
     */
    void familyMemberInfo() {
        try {
            FileWriter fileWriter = new FileWriter("family.txt", true);

            fileWriter.write(String.format("სახელი: %s\n", this.name));
            fileWriter.write(String.format("გვარი: %s\n", this.lastName));
            fileWriter.write(String.format("ასაკი: %d\n", this.age));
            fileWriter.write(String.format("სტატუსი: %s\n", this.status));

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    დაწერეთ მეთოდი, რომელიც FamilyMember ტიპის ობექტს საშუალებას მისცემს მიმართოს FamilyBudget ტიპის ობიექტს და მოსთხოვოს თანხა, თანხის მიღება განხორციელდება იმ შემთხვევაში თუ money ველში მოთხოვნილ თანხაზე მეტი თანხაა.
     */
    void getFamilyMoney(FamilyBudget familyBudget, int money) {
        if (money > 0 && familyBudget.getMoney() > money) {
            familyBudget.changeMoney(-money);
        } else {
            System.out.println("შეუძლებელია ოპერაციის შესრულება.");
        }
    }
}
