package com.cydeo;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {


    public static void main(String[] args) {


        //---------------ALL MATCH------------------//

        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);

        // all match checks if all the dish cal less than 1000 than return true Even if one of them more than 100 it will return false

        System.out.println(isHealthy); // all the dishes less than 1000 cal


        //---------------ANY MATCH------------------//

        // Even one of the dishes is vegetarian it will return true

        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("Vegetarian friendly");
        }


        //---------------NONE MATCH------------------//

        // if none of them is matching, it will return true

       boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);


        System.out.println("--------------------------");
        //---------------FIND ANY------------------//
       // here it will return any of the vegetarian dishes
        Optional<Dish>dish=DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        //---------------FIND FIRST------------------//
        // here it will find the veggie dishes and return the first one
        Optional<Dish>dish2=DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2);

        // PARALLEL STREAMS (Async)=> es zamanli olmayan
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());


        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

      //  Optional<String>findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
       // Optional<String> findAny=list2.parallelStream().filter(s -> s.startsWith("J")).findAny();

        Optional<String>findFirst = list1.stream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny=list2.stream().filter(s -> s.startsWith("J")).findAny();


        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        //------------------------MIN AND MAX----------------------------//
        // min accepts the Comparator interface
       Optional<Dish> min= DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(min.get());

        Optional<Dish> max= DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(max.get());


























    }


}
