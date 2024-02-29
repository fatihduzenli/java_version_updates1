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

        System.out.println("========================================");
        AppleString str =  apple -> "An apple of "+apple.getWeight()+" gram";

        AppleString type =  apple ->{
            if (apple.getWeight()>200){
                return "A Heavy "+apple.getColor()+" Apple";
            }else {
             return    "A light "+apple.getColor()+" Apple";
            }
        };
 // Another way
        AppleString type2 = apple -> {
            String ch = apple.getWeight()>200 ? "Heavy" : "Light";
            return "A"+ ch+ " "+apple.getColor()+" apple";
        };



        printApple(inventory,str);
        printApple(inventory,type);



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
    public static void printApple (List<Apple> inventory, AppleString appleString){
        for (Apple eachApple : inventory) {
            String output = appleString.output1(eachApple);
            System.out.println(output);
        }
    }
}
