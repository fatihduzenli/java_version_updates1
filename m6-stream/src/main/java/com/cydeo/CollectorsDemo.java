package com.cydeo;

import com.cydeo.Task.Dish;
import com.cydeo.Task.DishData;
import com.cydeo.Task.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7);

        //-------------------toCollection(Supplier)------------- : is used to create a Collection using Collector

        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);


        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        //-----------to List------: returns a Collector interface that gathers the input data into a new list

        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .toList();
        System.out.println(numberList2);


        //----------------toMap(Function,Function)-------------- : returns a Collector interface that gathers the input data into a new map

        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishMap);


        //------------------summingInt(ToIntFunction)----------------- : returns a Collector that produces the sum of an Integer-valued func


        int sum = DishData.getAll().stream()
                // .collect(Collectors.summingInt(Dish::getCalories));
                .mapToInt(Dish::getCalories).sum();
        System.out.println(sum);


        //------------------counting()---------------------- : returns a Collector that counts the number of the elements


        long even = numbers.stream()
                .filter(x -> x % 2 == 0)
                //.collect(Collectors.counting());
                .count();
        System.out.println(even);

        //-----------------averagingInt(ToIntFunction)-----------------: returns the average of the integers passed values

        double average = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(average);


        //---------------joining()---------------: is used to join various elements of a character or string array into a single object


        List<String> courses = Arrays.asList("Java", "JS", "TS");

    //   String str = courses.stream()
    //           .collect(Collectors.joining(","));

        String str = String.join(",",courses);

        System.out.println(str);

        //------------partitioningBy()-----------: is used to partition a stream of objects (or a set of elements) based on a given predicate.


    Map<Boolean,List<Dish>> veggieDish= DishData.getAll().stream()
        .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);


        //--------------groupingBy()---------------; is used for grouping objects by some property and storing results in a Map instance


        Map<Type,List<Dish>> dishType = DishData.getAll().stream()       // here we created a group based on the type
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);












    }
}
