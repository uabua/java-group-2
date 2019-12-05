package com.company;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generator implements GeneratorInterface {
    private String alphabet;
    private String language;
    private String userInput;
    private int[] inputNumbers = new int[6];
    private String word;
    private String sentence;


    Generator(String language, String userInput) {
        this.language = language;
        this.userInput = userInput;

        alphabetGenerator(); // ანბანის დაგენერირება
        parseParameters(); // პარამეტრების (მეორე ინფუთის) გაპარსვა
        sortArray();
    }

    /*
    პარამეტრების ვალიდურობის შემოწმება. აუცილებელია რომ გამოყენებული იყოს p,w,s და
    რიცხვები და რიცხვებს შორის დეფისი.
     */
    boolean isValid() {
        String matcher = "^p-*\\d+-+\\d+-*s-*\\d+-+\\d+-*w-*\\d+-+\\d*+$";

        return Pattern.matches(matcher, this.userInput);
    }

    void parseParameters() {
        if (isValid()) {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(this.userInput);

            int index = 0;

            while (matcher.find()) {
                this.inputNumbers[index] = Integer.parseInt(matcher.group());
                index++;
            }
        } else {
            System.out.println("Sorry, your input is not valid. Read rules and try again, please.");
        }
    }

    void sortArray() {
        for (int index = 0; index < 5; index+=2) {
            int min = Math.min(this.inputNumbers[index], this.inputNumbers[index++]);
            int max = Math.max(this.inputNumbers[index], this.inputNumbers[index++]);

            this.inputNumbers[index] = min;
            this.inputNumbers[index++] = max;
        }
    }

    @Override
    public void alphabetGenerator() {
        String alphabet = "";
        char start, end;

        if (this.language.equals("ge")) {
            start = 'ა';
            end = 'ჰ';
        } else if (this.language.equals("ru")) {
            start = 'а';
            end = 'я';
        } else { // ნებისმიერ სხვაზე დააგენერირებს ინგლისურ ანბანს
            start = 'a';
            end = 'z';
        }

        for (int index = (int) start; index <= (int) end; index++) {
            alphabet += (char) index;
        }

        this.alphabet = alphabet;
    }

    @Override
    public void wordGenerator() {
        String word = "";

        int min = this.inputNumbers[4];
        int max = this.inputNumbers[5];

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        for (int index = 0; index < randomNumber; index++) {
            word += this.alphabet.charAt(random.nextInt(this.alphabet.length()));
        }

        this.word = word;
    }

    /*
    წინადადების გენერატორი. ყველა წინადადება იწყება 4 სფეისით.
     */
    @Override
    public void sentenceGenerator() {
        String sentence = "    ";
        int min = this.inputNumbers[2];
        int max = this.inputNumbers[3];

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        for (int index = 0; index < randomNumber; index++) {
            wordGenerator();
            sentence += this.word + " ";
        }

        this.sentence = sentence.stripTrailing();
    }

    @Override
    public String paragraphGenerator() {
        String paragraph  = "";
        int min = this.inputNumbers[0];
        int max = this.inputNumbers[1];

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        for (int index = 0; index < randomNumber; index++) {
            sentenceGenerator();
            paragraph += this.sentence + ".";
        }

        return paragraph; // საბოლოო ტექსტი
    }
}
