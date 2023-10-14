package org.example;

public class Main {
    public static void main(String[] args) {
        stringPlusNumber("Name", "10");
        System.out.println("Hello world!");
        boolean stringPlusNumber;
//        System.out.print(stringPlusNumber);
    }

    private static String stringPlusNumber(String name, String age) {

        name = "Nan";
        age = "27";

        return ( name + " " + age);
    }


}