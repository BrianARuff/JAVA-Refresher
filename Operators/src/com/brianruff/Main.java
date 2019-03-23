package com.brianruff;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;

        result = result - 1;
        System.out.println(result);

        result = result * 10;
        System.out.println(result);

        previousResult = result;

        result = result / 5;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);

        previousResult = result;
        result = result + 1;
        System.out.println(result++);
        System.out.println(result--);
        System.out.println(result += 2);
        System.out.println(result *= 10);
        System.out.println(result -= 10);
        System.out.printf(String.valueOf(result /= 3));

        boolean isAlien = true;
        if(isAlien == false) {
            System.out.println("\nIs not Alien.");
        } else {
            System.out.println("\nIs Alien.");
        }

        int topScore = 100;
        if(topScore == 100) {
            System.out.println("Score is 100");
        }
        topScore--;
        if(topScore != 100) {
            System.out.println("Score is not 100");
        }
        if(topScore > 1) {
            System.out.println("Score is greater than 1");
        }
        if(topScore >= 99) {
            System.out.println("Score is greater than or equal to 99");
        }
        if(topScore < 1_000_000) {
            System.out.println("Top score is less than 1,000,000");
        }
        if(topScore <= 99) {
            System.out.println("Top score is less than or equal to 99");
        }
        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second-top-score and less than 100");
        }
        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println(topScore);
            System.out.println(secondTopScore);
            System.out.println("Top score is greater than 90 or the second-top-score is less than or equal to 90");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is true.");
        }

        boolean isChar = false;
        if(isChar = true /* reassigned value of isChar and then evaluated it. Works with booleans */) {
            System.out.println("This is not supposed to run");
        }
        if(isChar) System.out.println("Is a character.");

        boolean wasChar = isChar ? true : false;
        System.out.println(wasChar);

        double v1 = 20;
        double v2 = 80;
        double res = (v1 + v2) * 25;
        double remainder = res % 40;
        if(remainder <= 20) {
            System.out.println("Total was over the limit.");
        }
    }
}
