package com.cydeo.task;

import com.cydeo.Apple;
import com.cydeo.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {


    public static void main(String[] args) {



        // *****************************PREDICATE*****************************//
          // Accepting one parameter and returning boolean
        Predicate<Integer> lesserThen = i -> i < 18;

        System.out.println(lesserThen.test(100));


        // *****************************CONSUMER*****************************//
        // Accept a parameter and doesn't return anything

        Consumer<Integer> display = integer -> System.out.println(integer);

        display.accept(100);

        // *****************************BICONSUMER*****************************//
        // Accepts 2 (Object) parameter returns nothing


        BiConsumer <Integer,Integer> addTwo = (x,y) -> System.out.println(x*y);
        addTwo.accept(10,10);


        // *****************************FUNCTION*****************************//
        // Accepts object and return object (anything)
        //          T       R      => "T" is parameter, "R" is return type
        Function <String,String> fun = s -> "Hello"+ s;
        System.out.println(fun.apply("Fatih")); // when we return something, we need to put it in the sout



        // *****************************BIFUNCTION*****************************//
        // Takes 2 parameters and return one object

        BiFunction<Integer,Integer,Integer> func = (integer, integer2) -> integer+integer2;
        System.out.println(func.apply(90, 90));

        // *****************************SUPPLIER*****************************//
        // doesnt take any parameter and return something
         //        R is a return
        Supplier<Double> randomValue= () -> Math.random();
        System.out.println(randomValue.get());


    }


}
