package com.company.galaxy;

import java.util.Scanner;

/*
კონსოლური აპლიკაცია, რომელიც საშუალებას იძლევა ავაგოთ გალაქტიკა.
პროგრამის ჩატვირთვისას ჩნდება წარწერა, შექმენით ვარსკვლავი. ამის შემდეგ ეტაპობრივად
შესაძლებელია ვარსკვლავის მახასიათებლების შეყვანა. სახელი, დიამეტრი, ტემპერატურა. ვარსკვლავის
გარშემო ტრიალებენ პლანეტები. ამიტომ შეგვიძლია პლანეტების შექმნა. როდესაც პლანეტას ქმნით,

მიუთითეთ სახელი, ვარსკვლავი რომლის გარშემო ტრიალებს, რა მანძილითაა დაშორებული ვარ-
სკვლავისგან და რა სიჩქარით გადაადგილდება სივრცეში. ბრძანებით შესაძლებელია თითოეული

პლანეტის გამოძახება და თვისებების ნახვა. პლანეტის გამოძახებისას უნდა გამოჩნდეს, რა დროს
ანდომებს ის ვარსკვლავის გარშემო გადაადგილებას. (ეს პროგრამამ უნდა გამოთვალოს). პროგრამამ უნდა
შეძლოს პლანეტების გამოძახება პირდაპირ მათი სახელით. ასევე უნდა შეძლოს მთლიანი გალაქტიკის
დათვალიერება, ვარსკვლავებითა და მათ გარშემო მოძრავი პლანეტებით.
მონაცემები პლანეტების და ვარსკვლავების შესახებ იწერება ფაილში.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Galaxy galaxy = new Galaxy();

        System.out.println("ოლა! ^_^ პატარა გალაქტიკა ხომ არ შეგვექმნა?\nმოდი, ვარსკვლავით დავიწყოთ ⭐");

        Star mainStar = createStar(); // სულსულსულ პირველი ვარსკვლავი აუცილებლად შესაქმნელი
        galaxy.addStarInfo(mainStar.name, mainStar.diameter, mainStar.temperature);

        while (true) {
            System.out.println("ისევ ვარსკვლავს შექმნი თუ პლანეტას? ^_^ ან იქნებ გალაქტიკის დათვალიერება გინდა? ან პლანეტის ნახვა?");
            System.out.print("დაბეჭდე s ვარსკვლავის, p კი პლანეტის შესაქმნელად, გალაქტიკის სანახავად - galaxy, პლანეტის კი planet, პროგრამიდან გამოსასვლელად კი exit: ");
            String userInput = scanner.nextLine();

            // იუზერის ინფუთის მიხედვით ხდება შემდეგი მოქმედებები:
            if (userInput.equals("s")) {
                Star star = createStar();
                galaxy.addStarInfo(star.name, star.diameter, star.temperature);
            } else if (userInput.equals("p")) {
                Planet planet = createPlanet();
                galaxy.addPlanetInfo(planet.name, planet.distance, planet.velocity, planet.time);
                galaxy.addPlanetsAndStars(planet.name, planet.star);

                if (!galaxy.stars.containsKey(planet.star)) {
                    System.out.println("ჩვენს გალაქტიკაში ასეთი ვარსკვლავი, რომელიც მიუთითე, ჯერ არ ფიქსირდება. იმედია მოგვიანებით შექმნი!");
                }
            } else if (userInput.equals("galaxy")) {
                galaxy.readFromFile();
            } else if (userInput.equals("planet")) {
                System.out.print("პლანეტის სახელი: ");
                String planetName = scanner.nextLine();

                try {
                    double[] planetsArray = galaxy.planets.get(planetName);
                    System.out.println(String.format("პლანეტა: %s\nვარსკვლავი, რომლის გარშემოც მოძრაობს: %s\nდაშორება ვარსკვლავიდან: %fკმ\nსიჩქარე: %fკმ/სთ\nვარსკვლავის გარშემო 1 ბრუნის შესრულების დრო: %fსთ", planetName, galaxy.planetsAndStars.get(planetName), planetsArray[0], planetsArray[1], planetsArray[2]));
                } catch (Exception e) {
                    System.out.println("ასეთი პლანეტა ამ სისტემაში არ არსებობს...");
                }
            } else if (userInput.equals("exit")) {
                break;
            } else {
                System.out.println("რაღაც შეცდომაა, მოდი, ახლიდან ცადე! ☀");
            }
        }

    }

    static Star createStar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("შექმენი ვარსკვლავი!⭐");

        System.out.print("სახელი: ");
        String name = scanner.nextLine();

        System.out.print("დიამეტრი (კმ): ");
        double diameter = scanner.nextDouble();

        System.out.print("ტემპერატურა (ცელსიუსი): ");
        double temperature = scanner.nextDouble();

        return new Star(name, diameter, temperature);
    }

    static Planet createPlanet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("შექმენი პლანეტა!");

        System.out.print("სახელი: ");
        String name = scanner.nextLine();

        System.out.print("ვარსკვლავი რომლის გარშემოც ბრუნავს: ");
        String star = scanner.nextLine();

        System.out.print("მანძილი ვარსკვლავიდან (კმ): ");
        double distance = scanner.nextDouble();

        System.out.print("სიჩქარე (კმ/სთ): ");
        double velocity = scanner.nextDouble();

        return new Planet(name, star, distance, velocity);
    }
}