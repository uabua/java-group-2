package com.company.consultant;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FileOperations {
    void writeToFile() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        HashMap<String, String> commands = new HashMap<>();

        commands.put("help", "Better call Saul.");
        commands.put("date", simpleDateFormat.format(date));
        commands.put("name", "My name's Blurryface and I care what you think.");
        commands.put("error", "404 Not Found");

        try {
            FileWriter fileWriter = new FileWriter("info.txt", true);

            for (Map.Entry<String, String> entry : commands.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                fileWriter.write(String.format("%s----%s\n", key, value));
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String readFile(String command) {
        // თუ ისეთ ბრძანებას შეიყვანს, რომელიც ჰეშმეფში არ გვაქვს
        String commandDescription = "Oops, command not found.";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("info.txt"));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith(command)) {
                    commandDescription = line.substring(line.lastIndexOf("-") + 1);
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return commandDescription;
    }
}
