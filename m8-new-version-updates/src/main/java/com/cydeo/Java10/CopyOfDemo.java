package com.cydeo.Java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {

    public static void main(String[] args) {


        List<Integer>numberList = Arrays.asList(2,4,6,8);



        List<Integer> unmodifiableList=List.copyOf(numberList);
        List<Integer> unmodifiableList2=List.of(2,4,6,8);

        // Both make the list unmodifiable; However, copyOf takes the list listOf takes an element.

    }
}
