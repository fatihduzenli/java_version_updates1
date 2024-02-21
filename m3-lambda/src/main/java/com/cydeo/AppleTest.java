package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();


        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

        inventory.forEach(apple -> System.out.println(apple));

/*
        List<Apple>bigApples = filteringApples(inventory,new AppleHeavyPredicate());
        System.out.println(bigApples);
        System.out.println("---------------");
        List<Apple> greenApple = filteringApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);


 */
ApplePredicate color = apple -> apple.getColor().equals(Color.GREEN);

ApplePredicate weight  = apple -> apple.getWeight()>200;

        System.out.println(filteringApples(inventory, color));
        System.out.println(filteringApples(inventory, weight));


    }




    private static List<Apple> filteringApples (List<Apple> inventory, ApplePredicate applePredicate){
        List<Apple>result = new ArrayList<>();

        for (Apple eachApple : inventory) {
            if (applePredicate.test(eachApple)){
                result.add(eachApple);
            }
        }
        return result;
    }
}
