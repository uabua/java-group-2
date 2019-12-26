package com.company.galaxy;

import java.io.FileWriter;
import java.io.IOException;

public class Star {
    String name;
    double diameter;
    double temperature;

    Star(String name, double diameter, double temperature) {
        this.name = name;
        this.diameter = diameter;
        this.temperature = temperature;

        writeToFile();
    }

    void writeToFile() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("galaxy.txt", true);

            fileWriter.write(String.format("***\nვარსკვლავი\nვარსკვლავის დასახელება: %s\nდიამეტრი: %f\nტემპერატურა: %f\n\n", this.name, this.diameter, this.temperature));

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}