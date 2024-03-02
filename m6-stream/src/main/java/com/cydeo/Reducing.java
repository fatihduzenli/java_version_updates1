package com.cydeo;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

//        int sum = 0;
//        for(int number : numbers){
//            sum = sum + number;
//        }

        int result = numbers.stream().reduce(0,(a,b) -> a+b);

        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a+b);
        System.out.println(result2.get());


        System.out.println("Dish calories total:");

        // reduce method sums all the elements, down below we found the sum of total cal.

        Optional<Integer> calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
//                .reduce((a,b) -> a+b)
                .reduce(Integer::sum); // This is better than the one up line

        System.out.println(calTotal.get());

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum.get());


        //---------------COUNT--------------------//
        // this count method counts the data amount and returns long
       long dishCount= DishData.getAll().stream().count();
        System.out.println(dishCount);





















    }
}
