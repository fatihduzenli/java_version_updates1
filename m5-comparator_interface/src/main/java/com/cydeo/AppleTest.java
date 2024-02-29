package com.cydeo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(500, Color.RED));
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));
/*
STEPS
- We use Comparator functional interface to get the function
- then we call the sort method which accepts Comparator function
 */

        Comparator<Apple> sortApple = Comparator.comparing(Apple::getWeight);
        inventory.sort(sortApple);
        System.out.println(inventory);

        // a shorter way
        // after we import the static method, we can just call it with method name

        inventory.sort(comparing(Apple::getWeight));

        inventory.sort(comparing(Apple::getWeight).reversed()); // this reverses the sorting
        System.out.println(inventory);

        System.out.println("===================================================================");
        // Chaining

        inventory
                .sort(comparing(Apple::getWeight)
                        .reversed().thenComparing(Apple::getColor));
        System.out.println(inventory);

        inventory.sort(comparing(Apple::getColor).thenComparing(Apple::getWeight).reversed());
        System.out.println(inventory);


    }
}
