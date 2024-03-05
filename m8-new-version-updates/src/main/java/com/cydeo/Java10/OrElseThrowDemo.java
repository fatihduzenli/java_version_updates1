package com.cydeo.Java10;

import java.util.Optional;

public class OrElseThrowDemo {

    public static void main(String[] args) {

        // basically replace the isPresent method


        Optional<String> str = Optional.empty();

        System.out.println(str.get()); // this will return us a string, However, this will give us exception

        if (str.isPresent()){
            System.out.println(str.get());
        }else {
            //exception handling
        }

        // After java 10 update

        System.out.println(str.orElseThrow()); // this method does the same job with is present and get method

    }
}
