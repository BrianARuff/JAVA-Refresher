package com.brianruff;

public class Main {

    public static void main(String[] args) {
        char myChar = '\u00A9'; // width of 16 bits (2 bytes)
        System.out.println(myChar);

        boolean myBoolean = true;
        System.out.println(myBoolean);

        char registeredSymbol = '\u00AE';
        System.out.println(registeredSymbol);
    }
}
