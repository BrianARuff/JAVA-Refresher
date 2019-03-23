package com.company;

public class Main {

    public static void main(String[] args) {
        // width of an int == 32 bits (4 bytes)
        // width of a float == 32 bits (4 bytes)
        // width ofa double == 64 bits (8 bytes) --> faster on modern computers --> used by built in library functions in JAVA --> double is far more precise than int and float.
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(""+myDoubleValue);

        double lbs = 200d;
        double lbsTokgs = lbs * 0.45359237d;
        System.out.println(lbsTokgs);
        double pi = 3_000_000.141_592_27d;
        System.out.println(pi);
    }
}
