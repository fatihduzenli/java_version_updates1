package com.cydeo.java11;

public class StringMethodDemo {
    public static void main(String[] args) {

        var str = "Mike \n Ozzy \n Tom \n Emmy";

        str.lines().forEach(System.out::println);


        // lines() method convert all the line in the string to stream, so we can use intermediate stream operations
    }
}
