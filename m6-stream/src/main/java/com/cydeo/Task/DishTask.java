package com.cydeo.Task;

import static java.util.Comparator.*;
import java.util.List;

public class DishTask {

    public static void main(String[] args) {

     //-----Task1--------Print all the dish names that has less than 400 cal


        List<Dish> list = DishData.getAll();
        list.stream()
                .filter(each-> each.getCalories()<400)
                .forEach(System.out::println);




     //--------Task2--------Print the length of each dish name

        list.stream()
                .map(each->each.getName().length())
                .forEach(System.out::println);

        System.out.println("---------------------------------------");

     //-----------Task3--------Print three high cal dish name (>300)

        list.stream()
                .filter(each-> each.getCalories()>300)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("---------------------------------------");

      //----------Task4--------Print all the dish name that are below 400 cal in sorted

        list.stream()
                .filter(each-> each.getCalories()<400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);



    }


}
