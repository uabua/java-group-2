package com.company;

/*
1.

2.
 */
public class Main {
    public static void main(String[] args) {
        chat();
        consultant();
    }

    /*
    ააგეთ ჩათი, რომელიც დაჯდება 8080 პორტზე, მონაცემების მიმოცვლისათვის
    მოახდინეთ მომხმარებლის IP-ის შეყვანა პროგრამის დასაწყისში. დაწერეთ პროგრამა
    კლიენტის მხარეს, სერვერის მხარეს.
     */
    static void chat() {
        Thread serverThread = new Thread(new com.company.chat.Server());
        serverThread.start();

        Thread clientThread = new Thread(new com.company.chat.Client());
        clientThread.start();
    }

    /*
    ააგეთ რომელიც მოუსმენს 8081 პორტს და შესაბამისად დაამუშავებს შემდეგი ტიპის
    ინფორმაციას:
    კლიენტის ბრძანებები: help, date, name, error
    შესაბამისად help - სერვერი გაუგზავნის info.txt ფაილში help ველში ჩაწერილ
    ინფორმაციას შესაბამისად date – date ველში ჩაწერილ ინფორმაციას და ა.შ. ფაილში
    ველები ერთმანეთისგან გამოყოფილია ოთხი ტირით „----“, დაწერეთ შესაბამისი
    info.txt ფაილში ჩასაწერი პროგრამული კოდი (ცალკე კლასში);
     */
    static void consultant() {
        Thread serverThread = new Thread(new com.company.consultant.Server());
        serverThread.start();

        Thread clientThread = new Thread(new com.company.consultant.Client());
        clientThread.start();
    }
}
