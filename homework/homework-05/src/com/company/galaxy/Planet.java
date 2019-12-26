package com.company.galaxy;

import java.io.FileWriter;
import java.io.IOException;

public class Planet {
    String name;
    String star;
    double distance;
    double velocity;
    double time;
    double circumference;

    Planet(String name, String starName, double distance, double velocity) {
        this.name = name;
        this.star = starName;
        this.distance = distance;
        this.velocity = velocity;
        this.circumference = 2 * Math.PI * this.distance;
        this.time = this.circumference / this.velocity;

        writeToFile();
    }

    void writeToFile() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("galaxy.txt", true);

            fileWriter.write(String.format("***\nპლანეტა\nპლანეტის დასახელება: %s\nვარსკვლავი, რომლის გარშემოც მოძრაობს: %s\nდაშორება ვარსკვლავიდან: %fკმ\nსიჩქარე: %fკმ/სთ\nვარსკვლავის გარშემო 1 ბრუნის შესრულების დრო: %fსთ\n\n", this.name, this.star, this.distance, this.velocity, this.time));

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}