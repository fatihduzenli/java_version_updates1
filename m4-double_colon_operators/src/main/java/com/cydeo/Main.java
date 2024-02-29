package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {


        Calculate s1 = ((x, y) -> System.out.println(x + y));

        Calculate sum = (x, y) -> Calculator.findSum(x,y); // we can call method that has same type of implementation


        //--------------- Reference to STATIC METHOD ------------------------//

        // if our lambda expression coming from static method, we can just call the method by double colon
        Calculate s2 = Calculator::findSum;
        s2.calculate(10,20);

       System.out.println("------------------------------------------------");

        //--------------- Reference to INSTANCE METHOD -------------------//

        Calculator obj =new Calculator();

        Calculate s3 = obj::findMultiply;
        //OR
        Calculate s4 = new Calculator()::findMultiply;

        System.out.println("-----------------------------------------------");

        BiFunction<String,Integer,String> func = (str,i) ->str.substring(i);
        BiFunction<String,Integer,String> func2 = String::substring;

        // when the class name is not passing as a parameter, we need to create an object to call method
        Function<Integer,Double>func3 = new MyClass()::method;

        // if the functional interface taking the class name as a parameter, we can call the method with just class name

        BiFunction<MyClass,Integer,Double> func4 =MyClass::method;

        Consumer<Integer>display = i -> System.out.println(i);
        Consumer<Integer>display2 = System.out::println;
        // println is a static method that comes from System.out class, so we can call it with double colon































    }
}
