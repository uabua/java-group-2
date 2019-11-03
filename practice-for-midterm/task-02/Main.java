package com.company.task2;

public class Main {
    public static void main(String[] args) {
        FamilyBudget familyBudget = new FamilyBudget();
        familyBudget.setMoney(7000);
        familyBudget.changeMoney(-100);
        System.out.println(familyBudget.getMoney());
        familyBudget.familySituation();

        FamilyMember familyMember = new FamilyMember("მარიამი", "ჩახვაძე", 20, "სტუდენტი");
        familyMember.familyMemberInfo();
        familyMember.getFamilyMoney(familyBudget, 450);
    }
}
