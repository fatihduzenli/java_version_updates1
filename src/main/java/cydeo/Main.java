package cydeo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();// now ArrayList accepts only integer

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        // items.add("Apple");

        printDoubled(items);






    }


    private static void printDoubled(ArrayList<Integer> items){

        for (int eachItem : items) {
            System.out.println(eachItem*2);
        }
    }



}
