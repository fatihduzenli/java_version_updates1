package com.cydeo.Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumber {

    public static void main(String[] args) {

        List<Integer> numb = Arrays.asList(1,2,3,4,5);

        numb=numb.stream()
                .map(a -> (a*a))
                .collect(Collectors.toList());

        System.out.println(numb);
    }
}
