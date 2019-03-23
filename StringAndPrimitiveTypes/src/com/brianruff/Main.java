package com.brianruff;

public class Main {

    public static void main(String[] args) {
        String mystring = "this is a string";
        System.out.println(mystring + ", right \u00A9 2019?");

        String numberString = "250.55";
        numberString += "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        System.out.println(lastString + myInt);
    }
}
