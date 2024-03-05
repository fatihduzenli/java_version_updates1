package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {


        List<Integer> number = Arrays.asList(2,4,2,10,23);
/*
                                     WHAT IS OPTIONAL
     - Let's say we are working with a list of collections, and we want to stream action,
     but we have no data or no correct data, When we try to do certain manipulation, let's say we have no string, but
     we try to use substring that would cost nullPointer Exception. Optional will prevent this situation cause there is a
     protection method inside


 */ // what is optional


        //--------------- empty() - isPresent() ------------------------//

        Optional<String> empty = Optional.empty();

      //  System.out.println(empty);

      //  System.out.println(empty.isPresent());  // there is nothing present, so it will return false


      //  System.out.println(Optional.of(number).isPresent()); // there is something in it, so it will return true


    //    System.out.println(empty.get());


        number.stream().filter(x -> x>100).findAny();

        //ifPresent

        Optional<Integer> bigNumber=number.stream().filter(x -> x>100).findAny();


        bigNumber.ifPresent(System.out::println);  // this will print nothing instead of giving nullPointer

       //get
      //  System.out.println(bigNumber.get());

      //orElse

        System.out.println(bigNumber.orElse(10));  //with orElse we get the number we pass












    }


}
