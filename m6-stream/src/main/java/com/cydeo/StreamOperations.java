package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4);
        //list.forEach(p-> System.out.println(p));
        list.forEach(System.out::println);

        System.out.println("==============================================================");

        //--------------- OPERATORS------

        //---------------------------FILTER--------------------------


        list.stream()
                .filter(p -> p % 2 == 0)
                .forEach(System.out::println);


        //---------------------------DISTINCT--------------------------//

      Stream<Integer> stream= list.stream()
                .filter(p -> p % 2 == 0)
                .distinct();
      stream.forEach(System.out::println);  //The Stream is closed here

        System.out.println("----------");

        //---------------------------LIMIT--------------------------//

        list.stream()
                .filter(i -> i%2==0)
                .limit(2)  // prints first 2 element
                .forEach(System.out::println);

       //---------------------------SKIP--------------------------//


        list.stream()
                .filter(i -> i%2==0)
                .skip(1) // skips the first "n" element
                .forEach(System.out::println);
        System.out.println("-------------------");

        //--------------------------MAPPING-------------------------//

         list.stream()
                 .filter(i->i%2==0)
                 .map(i-> i*5) // multiply each element by 5
                 .forEach(System.out::println);


//---------Task------- Print the number of the characters for each word?

















    }
}
