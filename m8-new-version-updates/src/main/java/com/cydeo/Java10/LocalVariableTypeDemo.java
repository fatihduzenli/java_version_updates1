package com.cydeo.Java10;

import java.util.Arrays;

public class LocalVariableTypeDemo {

    public static void main(String[] args) {

        //---------Type Inference------------//
        /* Rules about type inference
        - we can only use with local variable not with an instance
        - no method parameter
        - no return value
        - no member variable
        - should be initialized at the time of declaration cause compiler will
        know the data type by the value

         */


        var str = "Hello World";

        byte x = 1;
        var y = 1; // int
        var price = 12.4; //double

        var number= Arrays.asList(1,2,3,4,5);


        var sum=0;

        for (var eachNumber :number){
            System.out.println(eachNumber);
        }

    }
}
