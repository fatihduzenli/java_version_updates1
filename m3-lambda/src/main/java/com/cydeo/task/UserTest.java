package com.cydeo.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Mike", "Smith", 90));
        users.add(new User("Fatih", "Duzenli", 50));
        users.add(new User("Sehri", "Duzenli", 70));
    // Q = Print all the elements in the list
        users.forEach(p -> System.out.println(p));
        System.out.println("-----------------");

        //Q = Print all the people that last name starts with e

       // 1.Approach

        users.forEach(lastName -> {
            if (lastName.getLastName().startsWith("D")) {
                System.out.println(lastName);
            }
        });

        System.out.println("--------------------------------------------");

       // 2.Approach


        Predicate<User> ln = lastName -> lastName.getLastName().startsWith("D");

        printName(users, ln);
        printName(users,user -> true);


    }

    private static void printName(List<User> users, Predicate<User> predicate) {
        for (User each : users) {
            if (predicate.test(each)) {
                System.out.println(each);
            }

        }
    }
}

