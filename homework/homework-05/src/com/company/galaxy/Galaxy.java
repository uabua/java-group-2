package com.company.galaxy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Galaxy {
    HashMap<String, double[]> stars = new HashMap<>(); // ვარსკვლავი და მისი პარამეტრები
    HashMap<String, double[]> planets = new HashMap<>(); // პლანეტა და მისი პარამეტრები
    HashMap<String, String> planetsAndStars = new HashMap<>(); // პლანეტა და ის ვარსკვლავი რის გარშემოც ბრუნავს

    void addStarInfo(String star, double diameter, double temperature) {
        this.stars.put(star, new double[]{diameter, temperature});
    }

    void addPlanetInfo(String planet, double distance, double velocity, double time) {
        this.planets.put(planet, new double[]{distance, velocity, time});
    }

    void addPlanetsAndStars(String planet, String star) {
        this.planetsAndStars.put(planet, star);
    }

    void readFromFile() {
        String line;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("galaxy.txt"));

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}