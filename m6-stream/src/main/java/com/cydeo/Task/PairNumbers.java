package com.cydeo.Task;

import java.util.Arrays;
import java.util.List;

public class PairNumbers {
    public static void main(String[] args) {


        List<Integer> numb1 = Arrays.asList(1,2,3);
        List<Integer> numb2 = Arrays.asList(3,4);


        numb1.stream()
                .flatMap(i ->numb2.stream().map(y->new int[]{i,y}))
                .forEach(pair-> System.out.println(Arrays.toString(pair)));

    }
}
