package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

// Ascending
        List<Integer>list = Arrays.asList(10,0,15,5,20);
        Collections.sort(list);
        System.out.println(list);

// Descending
        Collections.sort(list,new MyComparator());
        System.out.println(list);

        Collections.sort(list,((o1, o2) ->(o1>o2)? -1:(o1<o2)? 1 :0 ));

        //Ascending order

       // list.sort(((o1, o2) -> o1.compareTo(o2)));
        list.sort((Integer::compareTo));
        System.out.println(list);

        // Descending

        list.sort(((o1, o2) -> o2.compareTo(o1)));
        System.out.println(list);


    }
}
